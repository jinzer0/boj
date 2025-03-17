package silver.V;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj25206 {
	public static void main(String[] args) throws Exception {
		double grade, result_sum = 0.0, grade_sum = 0.0;
		char[] str;

		HashMap<Character, Double> map = new HashMap<>();
		map.put('A', 4.0);
		map.put('B', 3.0);
		map.put('C', 2.0);
		map.put('D', 1.0);
		map.put('F', 0.0);
		map.put('P', 0.0);
		map.put('+', 0.5);
		map.put('0', 0.0);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			grade = Double.parseDouble(st.nextToken());
			str = st.nextToken().toCharArray();

			if (str[0] == 'P') continue;
			if (str[0] == 'F') {
				grade_sum += grade;
				continue;
			}

			result_sum += grade * (map.get(str[0]) + map.get(str[1]));
			grade_sum += grade;
		}
		System.out.printf("%.6f", result_sum / grade_sum);
	}
}
