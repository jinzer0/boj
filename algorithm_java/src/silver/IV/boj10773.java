package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			if (k != 0) stack.push(k);
			else stack.pop();
		}

		while (!stack.empty()) sum += stack.pop();
		System.out.println(sum);
	}
}
