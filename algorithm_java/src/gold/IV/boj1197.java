package gold.IV;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class boj1197 {
	static int[][] arr;
	static int[] parent;
	static int v, e, weight = 0;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		v = scan.nextInt();
		e = scan.nextInt();
		arr = new int[e][3];
		parent = new int[v+1];

		for (int i = 0; i < parent.length; i++) parent[i] = i;

		for (int i = 0; i < e; i++) for (int j = 0; j < 3; j++) arr[i][j] = scan.nextInt();
		Arrays.sort(arr, Comparator.comparingInt(x -> x[2]));

		for (int i = 0; i < arr.length; i++) {
			if (!is_connected(arr[i][0], arr[i][1])) {
				weight += arr[i][2];
				merge(arr[i][0], arr[i][1]);
			}
		}
		System.out.println(weight);
	}

	static public int find(int x) {
		if (parent[x] == x) return x;
		return find(parent[x]);
	}

	static public void merge(int x, int y) {
		int a = find(x);
		int b = find(y);

		if (a > b) parent[a] = b;
		else parent[b] = a;
	}

	static public boolean is_connected(int x, int y) {
		int a = find(x);
		int b = find(y);

		return a == b;
	}
}
