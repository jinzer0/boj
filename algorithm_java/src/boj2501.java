import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj2501 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = 0;
		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 1; i < n + 1; i++) if (n % i == 0) list.add(i);

		try {
			System.out.print(list.get(k-1));
		} catch (Exception e) {
			System.out.print(0);
		}
		// STOPSHIP: 2024/10/10 1, n의 약수를 순차적으로 구하기
		// 2. 약수를 ArrayList 혹은 LinkedList에 삽입
		// 3. Collection중 k번째로 작은 수 출력
	}
}