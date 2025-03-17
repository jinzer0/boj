package bronze.II;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2745 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b, x, result = 0;
		char[] n;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = st.nextToken().toCharArray();
		b = Integer.parseInt(st.nextToken());

		for (int i = n.length - 1; i >= 0; i--) {
			x = (int) Math.pow(b, n.length - 1 - i);
			if (n[i] > 57) result += x * (n[i] - 55);
			else result += x * (n[i] - '0');
		}
		System.out.print(result);
	}
}
