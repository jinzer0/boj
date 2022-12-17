package silver.II;

import java.util.Arrays;
import java.util.Scanner;

public class boj9020 {
	public static int[] arr = new int[10001];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		sosu();

		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			num = scan.nextInt();
			gold(num);
		}

	}

	public static void gold(int num) {
		int div = num / 2;
		int x, y;
		if (arr[div] != 0) {
			System.out.println(div + " " + div);
			return;
		} else {
			for (int i = 1; i < div; i++) {
				x = div - i;
				y = div + i;
				if (arr[x] != 0 && arr[y] != 0) {
					System.out.print(x + " " + y + "\n");
					return;
				}
			}
		}
	}

	public static void sosu() {
		Arrays.fill(arr, 1);
		arr[0] = 0;
		arr[1] = 0;

		for (int i = 2; i < 10001; i++) {
			if (arr[i] == 1) {
				for (int j = 2 * i; j <= 10000; j += i) {
					arr[j] = 0;
				}
			}
		}
	}
}
