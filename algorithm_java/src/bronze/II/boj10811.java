package bronze.II;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10811 {
	public static void main(String[] args) throws Exception {
		int n, m, a, b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int[] arr_1 = new int[n+1];
		int[] arr_2 = new int[n+1];

		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = i;
			arr_2[i] = i;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			for (int j = a; j < b+1; j++) arr_1[j] = arr_2[a+b-j];
			arr_2 = arr_1.clone();
		}
		for (int i = 1; i < arr_1.length; i++) System.out.print(arr_1[i] + " ");
	}
}
