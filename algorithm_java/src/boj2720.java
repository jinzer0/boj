import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
quarter : 0.25, 25cents
dime : 0.1, 10cents
nickel : 0.05, 5cents
penny : 0.01, 1cent
 */

public class boj2720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int share, remain, q, d, n, p;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());

			q = c / 25;
			if (q != 0) c -= q * 25;
			d = c / 10;
			if (d != 0) c -= d * 10;
			n = c / 5;
			if (n != 0) c -= n * 5;
			p = c;
			System.out.println(q + " " + d + " " + n + " " + p);
		}
	}
}
