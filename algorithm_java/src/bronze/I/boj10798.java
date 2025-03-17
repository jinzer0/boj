package bronze.I;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10798 {
	public static void main(String[] args) throws Exception {
		char[][] arr = new char[5][15];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = st.nextToken().toCharArray();
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				try {
					System.out.print(arr[j][i]);
				} catch (ArrayIndexOutOfBoundsException e) {
					continue;
				}
			}
		}
	}
}
