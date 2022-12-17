package silver.I;

import java.util.Arrays;
import java.util.Scanner;

public class boj6588 {
	static int[] arr = new int[1000001];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, a, b;
		sosu();
		while ((N = scan.nextInt()) != 0) {
			for (int i = N - 1; i > (int) Math.sqrt(N); i--) {
				b = i;
				a = N - i;
				if (arr[a] == 1 && arr[b] == 1) {
					System.out.println(N + " = " + a + " + " + b);
					break;
				}
			}
		}
	}

	public static void sosu() {
		Arrays.fill(arr, 1);
		arr[0] = 0;
		arr[1] = 0;

		for (int i = 2; i < 1000000; i++) {
			if (arr[i] == 1) {
				for (int j = 2 * i; j <= 1000000; j += i) {
					arr[j] = 0;
				}
			}
		}
	}
}
