package bronze.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = n;
		int sum;

		for (int i = 1; i <= n; i++) {
			sum = 0;
			int k = i;
			sum += i;
			while (k != 0) {
				sum += k % 10;
				k /= 10;
			}
			if (sum == n) result = Math.min(result, i);
		}

		if (result == n) System.out.println(0);
		else System.out.println(result);
	}
}
