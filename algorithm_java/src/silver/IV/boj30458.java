package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj30458 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());

		String s = st.nextToken();
		int[] arr = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if (s.length()%2==1 && s.length()/2 == i) continue;
			arr[s.charAt(i)-'a']++;
		}

		for (int x : arr) {
			if (x % 2 == 1) {
				System.out.print("No");
				return;
			}
		}
		System.out.print("Yes");
	}
}
