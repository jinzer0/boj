package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj9471 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			int m = Integer.parseInt(st.nextToken());
			pisano(m);
		}
	}


	public static int fibo(int k) {
		int a = 1, b =1;
		if (k == 1 || k == 2) return 1;
		else for (int i = 1; i < k; i++) {
			int tmp = a;
			a = b;
			b += tmp;
		}
		return a;
	}

	public static void pisano(int m) {
		return;

	}

	public static int square(int k) {
		if (k % 2 == 0 && k % 5 != 0) {
			while (k != 0) {
				k/=2;
				if (k%2!=0) return 0;
			}
			return 2;
		}

		if (k % 2 != 0 && k % 5 ==0) {
			while (k != 0) {
				k /= 5;
				if (k%5!=0) return 0;
			}
			return 5;
		}


	return 0;}

}
