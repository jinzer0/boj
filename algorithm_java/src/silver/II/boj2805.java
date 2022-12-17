package silver.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long[] arr = new long[n];
		for (int i = 0; i < n; ++i) arr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);
		long left = 1;
		long right = arr[n-1];

		while (left<=right) {
			long length = 0;
			long half = (left+right)/2;
			for (int i = 0; i < n; ++i) length += arr[i] >= half ? arr[i]-half : 0;
			if (length < m) right = half-1;
			else left = half+1;
		}
		System.out.println(right);
	}
}
