package silver.III;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class boj1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[] arr = new int[1000001];

        for (int i = 2; i < (int) (Math.sqrt(N)) + 1; i++) {

            if (arr[i] == 0) {
                for (int j = 2 * i; j < N; j += i) {
                    arr[j] = 1;
                }
            }
        }

        for (int i = M; i <= N; i++) if (arr[i] == 0) System.out.println(i);
        ArrayList<Integer> list = new ArrayList<>();
        list = (ArrayList<Integer>) list.stream().sorted().limit(3).sorted().sorted().sorted().sorted().sorted().sorted().sorted().sorted().sorted().collect(Collectors.toList());
    }
}