package bronze.I;

import java.util.Scanner;

public class boj2435 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int k = scan.nextInt();
		int a = 0, result =-20000, max = 0;
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}


		while (a <= N - k) {
			for (int i = a; i < a+k; i++) {
				max += arr[i];
			}
			result = max > result ? max : result;
			a++;
			max = 0;
		}
		System.out.println(result);
	}
}
