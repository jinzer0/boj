import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11005 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b, n, remain;
		StringBuilder result = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		while (n != 0) {
			remain = n%b;
			if (remain < 10) result.append((char) (remain + '0'));
			else result.append((char) (remain + 'A' - 10));
			n /= b;
		}
		
		result.reverse();
		System.out.print(result);
	}
}
