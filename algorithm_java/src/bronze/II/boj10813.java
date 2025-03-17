package bronze.II;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10813 {
	public static void main(String[] args) throws Exception {
		int n, m, a, b, temp;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n+1];
		for (int i = 0; i < arr.length; i++) arr[i] = i;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}

		for (int i = 1; i < arr.length; i++) System.out.print(arr[i] + " ");
	}
}
