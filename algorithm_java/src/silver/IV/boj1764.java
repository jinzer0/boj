package silver.IV;

import java.io.*;
import java.util.*;

public class boj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) set.add(br.readLine());
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (set.contains(str)) arr.add(str);
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for (String i: arr) System.out.println(i);
    }
}