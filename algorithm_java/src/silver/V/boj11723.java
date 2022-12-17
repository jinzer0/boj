package silver.V;

import java.io.*;
import java.util.StringTokenizer;

public class boj11723 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		boolean[] set = new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false, false};


		int x;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
				case "add":
					x = Integer.parseInt(st.nextToken());
					if (!set[x]) set[x] = true;
					break;
				case "remove":
					x = Integer.parseInt(st.nextToken());
					if (set[x]) set[x] = false;
					break;
				case "check":
					x = Integer.parseInt(st.nextToken());
					if (set[x]) bw.write('1');
					else bw.write('0');
					bw.write('\n');
					break;
				case "toggle":
					x = Integer.parseInt(st.nextToken());
					set[x] = !set[x];
					break;
				case "all":
					set = new boolean[]{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true, true};
					break;
				case "empty":
					set = new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false, false};
					break;
			}
		}
		bw.close();
		br.close();
	}
}