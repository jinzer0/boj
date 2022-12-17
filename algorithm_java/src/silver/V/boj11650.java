package silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<grid> list = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new grid(x, y));
		}

		list.sort((grid o1, grid o2) -> {
			if (o1.x != o2.x) return Integer.compare(o1.x, o2.x);
			return Integer.compare(o1.y, o2.y);
		});

		for (grid x: list) System.out.println(x);
	}

	public static class grid {
		int x;
		int y;

		@Override
		public String toString() {
			return x + " " + y;
		}

		public grid(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
