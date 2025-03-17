package discrete;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class discrete_dijkstra {
    static int[][] graph;
    static int[] distance;
    static boolean[] visit;
    static int count = 1;
    static int[] route;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            graph = new int[n + 1][n + 1];
            for (int i = 1; i < graph.length; i++) for (int j = 1; j < graph.length; j++) graph[i][j] = 1000000;
            for (int i = 1; i < graph.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int node_v = Integer.parseInt(st.nextToken());
                while (st.hasMoreTokens()) {
                    int node_u = Integer.parseInt(st.nextToken());
                    int weight = Integer.parseInt(st.nextToken());
                    graph[node_v][node_u] = weight;
                }
                graph[node_v][node_v] = 0;
            }
            dijkstra();
        }
    }

    private static void dijkstra() {
        System.out.println("그래프 " + count++);
        visit = new boolean[graph.length];
        distance = new int[graph.length];
        route = new int[graph.length];
        sb = new StringBuilder();
        for (int i = 1; i < distance.length; i++) {
            distance[i] = graph[1][i];
            route[i] = 1;
        }

        visit[1] = true;
        for (int i = 1; i < graph.length; i++) {
            int v = lowest_cost();
            visit[v] = true;
            for (int u = 1; u < graph.length; u++) {
                if (visit[u]) continue;
                if (distance[u] > graph[v][u] + distance[v]) {
                    distance[u] = graph[v][u] + distance[v];
                    route[u] = v;
                }
            }
        }
        for (int i = 2; i < graph.length; i++) {
            System.out.print("정점 " + i + ": ");
            find(i);
            System.out.print(sb.reverse());
            sb = new StringBuilder();
            System.out.print(", 길이: " + distance[i]);
            System.out.println();
        }
        System.out.println();
    }

    private static int lowest_cost() {
        int cost = 1000000;
        int idx = 1;
        for (int i = 1; i < distance.length; i++) {
            if (visit[i]) continue;
            if (distance[i] < cost) {
                idx = i;
                cost = distance[i];
            }
        }
        return idx;
    }

    private static void find(int x) {
        if (x!=1) sb.append(x).append(" >- ");
        else sb.append(x);
        if (x != route[x]) find(route[x]);
    }
}