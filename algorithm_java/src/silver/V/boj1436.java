package silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		int k = 666;
		String str = String.valueOf(k);
		while (true) {
			for (int i = 0; i < str.length()-2; i++) if (str.charAt(i) == '6' && str.charAt(i+1) == '6' && str.charAt(i+2) == '6') {
				a--;
				break;
			}

			if (a == 0) {
				System.out.println(k);
				break;
			}

			k++;
			str = String.valueOf(k);
		}
	}
}
