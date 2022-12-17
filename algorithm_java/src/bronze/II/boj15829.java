package bronze.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj15829 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		char[] arr = br.readLine().toCharArray();
		long result = 0;
		long r = 1;
		long m = 1234567891;

		for (int i = 0; i < arr.length; i++) {
			result += ((long)arr[i]-96)*r;
			r = (r*31)%m;
		}
		System.out.println(result%m);
	}
}
