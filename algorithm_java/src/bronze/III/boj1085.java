package bronze.III;

import java.util.Scanner;

public class boj1085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int min = x > y ? y : x;
		min = w - x > min ? min : w - x;
		min = h - y > min ? min : h - y;
		System.out.println(min);
	}
}
