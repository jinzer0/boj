package silver.V;

import java.io.*;
import java.util.LinkedList;

public class boj2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> list = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) list.add(Integer.parseInt(br.readLine()));
		list.sort((x, y) -> Integer.compare(x, y));
		for (int i: list) sb.append(i).append('\n');
		System.out.println(sb);
	}
}