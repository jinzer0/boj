package gold.V;

import java.util.Scanner;

public class boj32763 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		boolean[] sign = new boolean[N + 1]; // true = +, false = -
		sign[1] = true; // Assume that s_1 is +
		char ch;

		for (int i = 2; i < N + 1; i++) {
			System.out.println("? 1 * " + i);
			System.out.flush();
			ch = sc.next().charAt(0);
			sign[i] = ch == '+';
		}

		for (int i = 2; i < N + 1; i++) {
			if (sign[i]) {
				System.out.println("? 1 + " + i);
				System.out.flush();
				ch = sc.next().charAt(0);

				if (ch == '-') for (int j = 1; j < N + 1; j++) sign[j] = !sign[j];
				break;
			}

			if (i == N) {
				System.out.println("? " + (N - 1) + " + " + N);
				System.out.flush();
				ch = sc.next().charAt(0);

				if (ch == '+') for (int j = 1; j < N + 1; j++) sign[j] = !sign[j];
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("! ");

		for (int i = 1; i < N + 1; i++) {
			if (sign[i]) sb.append("+ ");
			else sb.append("- ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
		System.out.flush();
	}
}