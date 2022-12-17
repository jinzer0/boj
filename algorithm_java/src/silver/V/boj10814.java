package silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<account> list = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			list.add(new account(age, name, i));
		}
		list.sort((account x, account y) -> {
			if (x.age > y.age) return 1;
			if (x.age < y.age) return -1;
			return Integer.compare(x.i, y.i);
		});

		for (account x: list) System.out.println(x);
	}

	static public class account {
		private String name;
		private int age;
		private int i;

		@Override
		public String toString() {
			return age + " " + name;
		}

		public account(int age, String name, int i) {
			this.age = age;
			this.name = name;
			this.i = i;
		}
	}
}
