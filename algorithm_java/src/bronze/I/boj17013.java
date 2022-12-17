package bronze.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj17013 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] arr = br.readLine().toCharArray();
		int[] origin = new int[]{1,2,3,4};
		int tmp0, tmp1;
		for (char c: arr) {
			switch (c) {
				case 'H':
					tmp0 = origin[0];
					tmp1 = origin[1];
					origin[0] = origin[2];
					origin[1] = origin[3];
					origin[2] = tmp0;
					origin[3] = tmp1;
					break;
				case 'V':
					tmp0 = origin[0];
					tmp1 = origin[2];
					origin[0] = origin[1];
					origin[2] = origin[3];
					origin[1] = tmp0;
					origin[3] = tmp1;
					break;
			}
		}
		sb.append(origin[0]).append(' ').append(origin[1]).append('\n').append(origin[2]).append(' ').append(origin[3]);
		System.out.println(sb);
	}
}
