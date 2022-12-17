package silver.II;

import java.util.Scanner;

public class boj4948 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, answer = 0;
		int[] arr = new int[246913];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < ((int)(Math.sqrt(246912))) + 1; i++) {
			if (arr[i] == 0) {
				for (int j = 2*i; j < 246913; j+=i) {
					arr[j] = 1;
				}
			}
		}

		while (true) {
			num = scan.nextInt();
			if (num == 0) break;
			for (int i = num+1; i <= num*2; i++) if (arr[i] == 0) answer++;
			System.out.println(answer);
			answer = 0;
		}
	}

}
