package silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<int[]> list = new LinkedList<>();
		int[] rank = new int[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new int[]{x, y});
		}

		for (int i = 0; i < n; i++) {
			rank[i]++;
			for (int j = 0; j < n; j++) if (list.get(i)[0] < list.get(j)[0] && list.get(i)[1] < list.get(j)[1]) rank[i]++;
		}

		for (int i: rank) System.out.print(i + " ");
	}
}
