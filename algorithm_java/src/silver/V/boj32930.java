package silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj32930 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] current_coor = new int[]{0, 0};
		int x, y, total_score = 0;
		ArrayList<int[]> target_list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			target_list.add(new int[]{x, y});
		}

		int[] longest_coor = null;
		int longest_distance = 0;

		for (int[] target : target_list) {
			int distance = (int) (Math.pow(target[0] - current_coor[0], 2) + Math.pow(target[1] - current_coor[1], 2));
			if (distance >= longest_distance) {
				longest_distance = distance;
				longest_coor = target;
			}
		}
		current_coor = longest_coor;
		target_list.remove(longest_coor);
		total_score += longest_distance;
		longest_distance = 0;

		for (int i = 0; i < m - 1; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			target_list.add(new int[]{x, y});
			for (int[] target : target_list) {
				int distance = (int) (Math.pow(target[0] - current_coor[0], 2) + Math.pow(target[1] - current_coor[1], 2));
				if (distance >= longest_distance) {
					longest_distance = distance;
					longest_coor = target;
				}
			}
			current_coor = longest_coor;
			target_list.remove(longest_coor);
			total_score += longest_distance;
			longest_distance = 0;
		}
		br.readLine();
		System.out.println(total_score);
	}
}
