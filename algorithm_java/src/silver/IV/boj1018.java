package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0 , result = 64;
		boolean is_white = true;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		boolean[][] arr = new boolean[M][N];

		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				if (str.charAt(j) == 'W') arr[i][j] = true;
				else arr[i][j] = false;
			}
		}

		for (int i = 0; i < M - 7; i++) {
			for (int j = 0; j < N - 7; j++) {
				for (int k = i; k < i+8; k++) {
					for (int l = j; l < j+8; l++) {
						if (arr[k][l] != is_white) count++;
						is_white = !is_white;
					}
					is_white = !is_white;
				}
				count = Math.min(count, 64-count);
				result = Math.min(result, count);
				count = 0;
			}
		}

		System.out.println(result);
	}
}

//"WBWBWBWB"
//"BWBWBWBW"