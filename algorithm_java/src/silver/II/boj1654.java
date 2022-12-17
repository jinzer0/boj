package silver.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		long[] arr = new long[k];
		for (int i = 0; i < k; i++) arr[i] = Long.parseLong(br.readLine());
		Arrays.sort(arr);

		long left = 1;
		long right = arr[k-1];

		while (left<=right) {
			int count = 0;
			long half = (left+right)/2;
			for (int i = 0; i < k; i++) count += arr[i]/half;

			if (count < n) right = half-1;
			else left = half+1;
		}
		System.out.println(right);
	}
}
