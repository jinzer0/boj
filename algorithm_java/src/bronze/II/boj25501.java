package bronze.II;

import java.util.Scanner;

public class boj25501 {
	static int count = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String str;
		for (int i = 0; i < T; i++) {
			str = scan.next();
			System.out.println(isPalindrome(str) + " " + count);
			count = 0;
		}
	}

	public static int recursion(String s, int l, int r) {
		count++;
		if (l >= r) return 1;
		else if (s.charAt(l) != s.charAt(r)) return 0;
		else return recursion(s, l + 1, r - 1);
	}

	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}
}
