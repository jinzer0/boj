package silver.II;

import java.util.ArrayList;
import java.util.Scanner;

public class boj4929 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result =0, a = 0, b =0;

		while (true) {
			int len_a = scan.nextInt();
			if (len_a == 0) break;

			ArrayList<Integer> list_a = new ArrayList<>(len_a);
			for (int i = 0; i < len_a; i++) {
				list_a.add(scan.nextInt());
			}

			int len_b = scan.nextInt();
			ArrayList<Integer> list_b = new ArrayList<>();
			for (int i = 0; i < len_b; i++) {
				list_b.add(scan.nextInt());
			}

			ArrayList<Integer> mix = new ArrayList<>();

			for (int i = 0; i < len_a; i++) mix.add(list_a.get(i));
			mix.retainAll(list_b);
			int k = 0, l = 0;
			a = 0;
			b = 0;
			result = 0;
			for (int i = 0; i < mix.size(); i++) {
				for (int j = k; j <= list_a.indexOf(mix.get(i)); j++) {
					a += list_a.get(j);

				}
				for (int m = l; m <= list_b.indexOf(mix.get(i)); m++) {
					b += list_b.get(m);
				}
				k = list_a.indexOf(mix.get(i)) + 1;
				l = list_b.indexOf(mix.get(i)) + 1;
				result += Math.max(a, b);
				a = 0;
				b = 0;
			}
			for (int i = k; i < list_a.size(); i++) a += list_a.get(i);
			for (int i = l; i < list_b.size(); i++) b += list_b.get(i);
			result += Math.max(a, b);
			System.out.println(result);
		}
	}
}