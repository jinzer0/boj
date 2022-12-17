package silver.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;


public class boj2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] fre = new int[8001];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			fre[arr[i]+4000]++;
		}
		Arrays.sort(arr);
		long avr = Math.round(IntStream.of(arr).sum()/(double)n);
		int mid = arr[n/2];
		int range = arr[n-1] - arr[0];
		int idx = 0;
		for (int i = 0; i < fre.length; i++) if (fre[idx] < fre[i]) idx = i;
		for (int i = 0; i < fre.length; i++) if (fre[idx] == fre[i] && idx < i) {
			idx = i;
			break;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(avr).append('\n').append(mid).append('\n').append(idx-4000).append('\n').append(range);
		System.out.println(sb);
	}
}