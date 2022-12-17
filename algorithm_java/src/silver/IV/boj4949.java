package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		label: while (true) {
			String str = br.readLine();
			if (str.equals(".")) break;
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(' || str.charAt(i) == '[') stack.push(str.charAt(i));
				if (!stack.isEmpty()) {
					if (str.charAt(i) == ')') {
						if (stack.peek() == '(') stack.pop();
						else {
							System.out.println("no");
							continue label;
						}
					}
					else if (str.charAt(i) == ']') {
						if (stack.peek() == '[') stack.pop();
						else {
							System.out.println("no");
							continue label;
						}
					}
				}
				else if (str.charAt(i) == ')' || str.charAt(i) == ']') stack.push(str.charAt(i));
			}

			if (stack.empty()) System.out.println("yes");
			else System.out.println("no");
		}
	}
}