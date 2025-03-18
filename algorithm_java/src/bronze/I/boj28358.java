package bronze.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class boj28358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int count = 0;
			ArrayList<Integer> a = (ArrayList<Integer>) Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
			boolean[] bool_arr = new boolean[10];
			for (int j = 0; j < a.size(); j++) bool_arr[j] = a.get(j) == 1;

			for (int j = 1; j < 13; j++) {
				if (is_contain(j, bool_arr)) continue;
				for (int k = 1; k < 32; k++) {
					switch (j) {
						case 4, 6, 9, 11 -> {
							if (k > 30) continue;
						}
						case 2 -> {
							if (k > 29) continue;
						}
					}
					if (is_contain(k, bool_arr)) continue;

					count++;
				}
			}
			System.out.println(count);
		}
	}

	private static boolean is_contain(int x, boolean[] booleans) {
		if (x < 10) {
			return booleans[x];
		} else {
			int q = x / 10;
			int r = x % 10;
			return booleans[q] || booleans[r];
		}
	}
}
