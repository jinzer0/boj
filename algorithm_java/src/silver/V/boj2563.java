package silver.V;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2563 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Boolean[][] arr = new Boolean[101][101];
		for (Boolean[] i: arr) Arrays.fill(i, false);
		int x, y, result = 0;
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			for (int j = x; j < x+10; j++) {
				for (int k = y; k < y+10; k++) {
					if (j >= 100 || y >= 100) break;
					arr[j][k] = true;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j]) result += 1;
			}
		}
		System.out.print(result);
	}
}
