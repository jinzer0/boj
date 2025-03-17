package silver.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1735 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int up = a*d + c*b;
		int down = b*d;

		int div_num = gcd(down, up);
		up /= div_num;
		down /= div_num;
		System.out.println(up + " " + down);
	}

	public static int gcd(int x, int y) {
		int div;
		if (x < y) {
			int temp = x;
			x = y;
			y = temp;
		}

		while (y !=  0) {
			div = x % y;
			x = y;
			y = div;
		}
		return x;
	}
}
