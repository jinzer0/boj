package bronze.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int result = 0;

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		for (int i = 0; i < n-2; i++) {
			for (int j = i + 1; j < n-1; j++) {
				for (int k = i + 2; k < n; k++) {
					if (arr[i]+arr[j]+arr[k] > m) continue;
					result = m-result > m-(arr[i]+arr[j]+arr[k]) ? arr[i]+arr[j]+arr[k] : result;
				}
			}
		}
		System.out.println(result);
	}
}
