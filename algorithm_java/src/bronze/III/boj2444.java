package bronze.III;

import java.util.Scanner;

public class boj2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i < n+1; i++) {
			for (int j = i; j < n; j++) System.out.print(" ");
			for (int j = 0; j < 2*i-1; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n-1; i > 0; i--) {
			for (int j = i; j < n; j++) System.out.print(" ");
			for (int j = 0; j < 2*i-1; j++) System.out.print("*");
			System.out.println();
		}
	}
}
