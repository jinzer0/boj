package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			String s = br.readLine();
			map.put(s, i);
			list.add(s);
		}
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if (str.charAt(0) > 48 && str.charAt(0) <= 57) System.out.println(list.get(Integer.parseInt(str)-1));
			else System.out.println(map.get(str));
		}
	}
}
