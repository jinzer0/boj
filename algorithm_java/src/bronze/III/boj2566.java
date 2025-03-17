package bronze.III;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2566 {
	public static void main(String[] args) throws Exception {
		int max = 0, r = 0, c = 0, temp = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				temp = Integer.parseInt(st.nextToken());
				if (max <= temp) {
					r = i;
					c = j;
					max = temp;
				}
			}
		}
		System.out.println(max);
		System.out.print(r+1);
		System.out.print(" ");
		System.out.print(c+1);
	}
}

