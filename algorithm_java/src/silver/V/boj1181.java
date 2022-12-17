package silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class boj1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n == 1) {
			System.out.println(br.readLine());
			return;
		}
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) set.add(br.readLine());
		ArrayList<String> arr = new ArrayList<>(set);

		arr.sort((String s1, String s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			}
			return s1.length() - s2.length();
		});

		for (String s: arr) System.out.println(s);
	}
}