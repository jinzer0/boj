package silver.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class boj1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			Queue<Integer> queue = new LinkedList<>();
			ArrayList<Integer> order = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int k = Integer.parseInt(st.nextToken());
			int o = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < k; j++) {
				order.add(Integer.parseInt(st.nextToken()));
				queue.add(order.get(j));
			}

			order.sort((x, y) -> Integer.compare(x, y) * -1);

			int idx = o;
			int count = 0;
			for (int j = 0; j < order.size(); j++) {
				while (order.get(j) != queue.peek().intValue()) {
					queue.add(queue.poll());
					idx = idx == 0 ? queue.size()-1 : idx-1;
				}
				count++;
				queue.poll();
				if (idx == 0) {
					System.out.println(count);
					break;
				}
				else --idx;
			}
		}
	}
}
