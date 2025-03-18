package gold.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class boj5430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		boolean is_reverse = false;

		int T = Integer.parseInt(st.nextToken());
		for (int i = 0; i < T; i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String x = br.readLine();
			x = x.substring(1, x.length() - 1);
			String[] x_arr = x.split(",");
			for (int j = 0; j < n; j++) {
				int item = Integer.parseInt(x_arr[j]);
				arrayDeque.addLast(item);
			}
			for (int j = 0; j < p.length(); j++) {
				if (p.charAt(j) == 'R') is_reverse = !is_reverse;
				if (p.charAt(j) == 'D') {
					if (!is_reverse) arrayDeque.removeFirst();
					else arrayDeque.removeLast();
				}
			}

		}

	}
}
