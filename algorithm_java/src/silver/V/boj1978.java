package silver.V;

import java.util.Scanner;

public class boj1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a, count = 0;
		for (int i = 0; i < n; i++) {
			a = scan.nextInt();
			if (sosu(a)) count++;
		}
		System.out.print(count);
	}
	public static boolean sosu(int x) {
		if (x == 1) return false;
		if (x == 2) return true;
		for (int i = 2; i < (int)(Math.sqrt(x))+1; i++) {
			if (x % 2 == 0) return false;
		}
		return true;
	}
}
