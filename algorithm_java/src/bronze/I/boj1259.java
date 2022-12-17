package bronze.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = br.readLine();
			if (str.charAt(0) == '0') break;
			if (palindrome(str)) System.out.println("yes");
			else System.out.println("no");
		}
	}

	public static boolean palindrome(String str) {
		int x = 1;
		Stack<Character> stack = new Stack<>();
		if (str.length()%2==0) x = 0;
		for (int i = 0; i < str.length()/2; i++) stack.push(str.charAt(i));
		for (int i = str.length()/2+x; i < str.length(); i++) if (stack.pop() != str.charAt(i)) return false;
		return true;
	}
}
