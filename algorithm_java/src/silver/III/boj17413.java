package silver.III;

import java.util.Scanner;
import java.util.Stack;

public class boj17413 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String result;
		Boolean is_tag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				printStack(stack);
				is_tag = true;
				System.out.print(str.charAt(i));
				continue;
			}

			if (str.charAt(i) == '>') {
				is_tag = false;
				System.out.print(str.charAt(i));
				continue;
			}

			if (is_tag) {
				System.out.print(str.charAt(i));
				continue;
			}

			if (str.charAt(i) == ' ') {
				printStack(stack);
				System.out.print(" ");
				continue;
			}

			stack.push(str.charAt(i));
		}
		printStack(stack);
	}

	public static void printStack(Stack<Character> st) {
		while (!st.isEmpty()) {
			char x = st.pop();
			System.out.print(x);
		}
	}
}
