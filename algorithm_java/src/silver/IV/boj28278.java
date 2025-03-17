package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj28278 {
	static int n;
	Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < n; i++) System.out.println();
	}
	private static int ss(int integer) {
		return 0;
	}
}

//1: 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
//2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//3: 스택에 들어있는 정수의 개수를 출력한다.
//4: 스택이 비어있으면 1, 아니면 0을 출력한다.
//5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.