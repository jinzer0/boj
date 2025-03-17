import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj11266 {

    static int V,E, order = 1, cnt = 0;
    static ArrayList<Integer>[] arr;
    static int[] visited;
    static boolean[] isCut;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        arr = new ArrayList[V+1];
        visited = new int [V+1];
        isCut = new boolean [V+1];
        for (int i=1; i<=V; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 1; i<=E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for (int i=1; i<=V; i++) {
            if (visited[i] == 0) {
                dfs(i, true, 0);
            }
        }

        for (int i=1; i<=V; i++) {
            if (isCut[i]) {
                cnt++;
                sb.append(i).append(" ");
            }
        }
        System.out.println("cut vetex count : " + cnt);
        System.out.println("cut vertices : " + sb);
    }

    static int dfs(int id, boolean isRoot, int parent) {
        visited[id] = order++;

        int current_order = visited[id];
        int child_order = 0;

        int len = arr[id].size();
        for (int i = 0; i<len; i++) {
            int now = arr[id].get(i);
            if (now == parent) continue;

            if (visited[now]==0) {
                child_order++;
                int low = dfs(now, false, id); // 자식 노즈중 최소 방문 순서
                if (!isRoot && low >= visited[id]) isCut[id] = true;
                current_order = Math.min(current_order, low);
            }
            else current_order = Math.min(current_order, visited[now]);
        }

        if (isRoot && child_order >=2) {
            isCut[id] = true;
        }
        return current_order;
    }
}