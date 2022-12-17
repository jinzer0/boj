package silver.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int idx = 0;
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			stack.push(i);
			sb.append('+').append('\n');
			while (!stack.isEmpty() && arr[idx] == stack.peek()) {
				stack.pop();
				++idx;
				sb.append('-').append('\n');
			}
		}
		if (stack.isEmpty()) System.out.println(sb);
		else System.out.println("NO");
	}
}
