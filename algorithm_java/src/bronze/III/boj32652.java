package bronze.III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj32652 {
	public static void main(String[] args) throws IOException {
		//AKARAKA
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder("AKA");
		sb.append("RAKA".repeat(K));
		System.out.print(sb);
	}
}
