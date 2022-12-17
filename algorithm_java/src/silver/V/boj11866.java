package silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) queue.add(i);
		System.out.print("<");
		while (!queue.isEmpty()) {
			for (int i = 0;  i < K-1; i++) {
				int tmp = queue.remove();
				queue.add(tmp);
			}
			if (queue.size() == 1) System.out.print(queue.poll() + ">");
			else System.out.print(queue.poll() + ", ");
		}
	}
}
