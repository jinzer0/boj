package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		label: for (int i = 0; i < n; i++) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine();
			if (str.length() % 2 != 0) {
				System.out.println("NO");
				continue;
			}
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') stack.push(str.charAt(j));
				if (str.charAt(j) == ')' && stack.empty()) {
					System.out.println("NO");
					continue label;
				}
				if (str.charAt(j) == ')') stack.pop();
			}
			if (stack.empty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

// ()( )()
//
