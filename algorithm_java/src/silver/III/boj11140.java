package silver.III;

import java.io.*;

public class boj11140 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str1 = br.readLine().toCharArray();
		char[] str2 = br.readLine().toCharArray();


		int[][] arr = new int[str1.length+1][str2.length+1];
		for (int i = 1; i <= str1.length; i++) {
			for (int j = 1; j <= str2.length; j++) {
				if (str1[i-1] == str2[j-1]) arr[i][j] = arr[i-1][j-1]+1;
				else arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
			}
		}
		System.out.println(arr[str1.length][str2.length]);
	}
}
