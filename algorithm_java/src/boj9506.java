import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class boj9506 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());


		while (n != -1) {
			LinkedList<Integer> list = new LinkedList<>();
			for (int i = 1; i < n + 1; i++) if (n % i == 0) list.add(i);
			Iterator<Integer> iterator = list.iterator();
			int result = 0;
			while (iterator.hasNext()) result += iterator.next();
			if (result - list.getLast() == n) {
				System.out.print(n + " = 1");
				for (int i = 1; i < list.size() - 1; i++) System.out.print(" + " + list.get(i));
				System.out.println();
			}
			else System.out.println(n + " is NOT perfect.");
			n = Integer.parseInt(br.readLine());
		}
	}
}