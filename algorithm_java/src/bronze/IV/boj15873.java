package bronze.IV;

import java.util.Scanner;

public class boj15873 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if (str.length() == 2) {
			System.out.println(Character.getNumericValue(str.charAt(0))+Character.getNumericValue(str.charAt(1)));
		} else if (str.length() == 4)  {
			System.out.println(20);
		} else {
			if (str.charAt(1) == '0') System.out.println(10+Character.getNumericValue(str.charAt(2)));
			else if (str.charAt(2) == '0') System.out.println(10+Character.getNumericValue(str.charAt(0)));
		}
	}
}
