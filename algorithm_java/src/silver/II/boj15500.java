package silver.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class boj15500 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> start = new LinkedList<>();
		LinkedList<Integer> middle = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).forEach(start::add);
		int count = 0;
		while (N != 0) {
			if (start.contains(N)) {
				while (start.size() > 0) {
					int pop_number = start.pollLast();
					if (pop_number == N) {
						sb.append("1 3\n");
						N--;
					} else {
						middle.add(pop_number);
						sb.append("1 2\n");
					}
					count++;
				}
			} else if (middle.contains(N)) {
				while (middle.size() > 0) {
					int pop_number = middle.pollLast();
					if (pop_number == N) {
						sb.append("2 3\n");
						N--;
					} else {
						start.add(pop_number);
						sb.append("2 1\n");
					}
					count++;
				}
			}
		}
		sb.insert(0, count + "\n");
		System.out.print(sb);
	}
}