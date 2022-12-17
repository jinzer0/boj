package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> li1 = new ArrayList<>(n);
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) li1.add(Integer.parseInt(st.nextToken()));

		int m = Integer.parseInt(br.readLine());
		List<Integer> li2 = new ArrayList<>(m);
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) li2.add(Integer.parseInt(st.nextToken()));

		Collections.sort(li1);

		for (int i = 0; i < m; i++) if (binarySearch(li1, li2.get(i))) System.out.println(1); else System.out.println(0);

	}

	public static boolean binarySearch(List<Integer> list, int k) {
		int start = 0, mid, end = list.size()-1;
		while (start <= end) {
			mid = (start+end)/2;
			int value = list.get(mid);

			if (value == k) return true;
			else if (value < k) start = mid+1;
			else end = mid-1;
		}
		return false;
	}
}
