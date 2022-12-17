package discrete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class dijk {
    static int[][] graph;
    static boolean[] visit;
    static int[] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            int i = Integer.parseInt(str);
            graph = new int[i+1][i+1];
            visit = new boolean[i+1];
            for (; i > 0; i--) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int vertex_v = Integer.parseInt(st.nextToken());
                int count = st.countTokens();
                for (int j = 1; j < graph.length; j++) graph[vertex_v][j] = Integer.MAX_VALUE;
                graph[vertex_v][vertex_v] = 0;
                for (int j = 1; j < count; j++) {
                    int vertex_u = Integer.parseInt(st.nextToken());
                    int weight = Integer.parseInt(st.nextToken());
                    graph[vertex_v][vertex_u] = weight;
                }
            }
            dijkstra(1);
        }
    }
    private static void dijkstra(int start_vertex) {
        visit[start_vertex] = true;
        for (int i = 1; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                
            }
            int small_vertex = get_small_cost(start_vertex);
        }
    }

    private static int get_small_cost(int start_vertex) {
        for (int i = 0; i < visit.length; i++) {

        }
        return 1;
    }
}
