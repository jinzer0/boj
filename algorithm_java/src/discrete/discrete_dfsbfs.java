package discrete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class discrete_dfsbfs {
	static boolean[][] graph;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String str;
		int graph_num = 1;
		while ((str = br.readLine()) != null) {
			int i = Integer.parseInt(str);
			graph = new boolean[i + 1][i + 1];
			visit = new boolean[i + 1];
			for (; i > 0; i--) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int vertex_v = Integer.parseInt(st.nextToken());
				while (st.hasMoreTokens()) {
					int vertex_u = Integer.parseInt(st.nextToken());
					graph[vertex_v][vertex_u] = true;
				}
			}
			System.out.println("±×·¡ÇÁ " + graph_num++);
			System.out.println("±íÀÌ ¿ì¼± Å½»ö");
			dfs(1);
			System.out.println("\b\b\b\b");
			visit = new boolean[visit.length];
			System.out.println("³Êºñ ¿ì¼± Å½»ö");
			bfs(1);
			System.out.println("\b\b\b\b\n");
		}


	}

	static private void dfs(int start_vertex) {
		visit[start_vertex] = true;
		System.out.print(start_vertex + " -> ");
		for (int i = 1; i < graph.length; i++) {
			if (!visit[i] && graph[start_vertex][i]) dfs(i);
		}
	}

	static private void bfs(int start_vertex) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start_vertex);
		visit[start_vertex] = true;
		while (!queue.isEmpty()) {
			int current_vertex = queue.poll();
			System.out.print(current_vertex + " -> ");
			for (int i = 1; i < graph.length; i++) {
				if (!visit[i] && graph[current_vertex][i]) {
					visit[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
