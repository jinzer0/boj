package silver.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int block = Integer.parseInt(st.nextToken());
		int[] arr = new int[n*m];
		int min = 1000, max = 0, second = Integer.MAX_VALUE, height = 0;


		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = m*i; j < m*i+m; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				min = Math.min(min, arr[j]);
				max = Math.max(max, arr[j]);
			}
		}

		for (int i = max; i >= min; i--) {
			int insert = 0;
			int remove = 0;
			int sec;
			for (int j = 0; j < n*m; j++) {
				if (arr[j] > i) remove += arr[j] - i;
				else if (arr[j] < i) insert += i - arr[j];
			}

			if (block < insert - remove) continue;
			sec = insert + remove*2;
			if (sec < second) {
				second = sec;
				height = i;
			}
			else if (sec == second) height = Math.max(height, i);
		}
		sb.append(second).append(' ').append(height);
		System.out.println(sb);
	}
}
