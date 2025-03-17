import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2903 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print((int) ((Math.pow(2, n) + 1) * (Math.pow(2, n) + 1)));

		/*
		문제 풀이가 간단한 이유
		1. 일련의 규칙이 있는데, 모든 점의 개수는 모두 제곱수이다.
		2. 이때 모든 점의 개수는 한 변의 점의 개수의 제곱과 같다.
		3. 한 변의 점의 개수는 한 변에 있는 가장 작은 정사각형의 개수에 1을 더한 값과 같다.
		4. 문제에서 제시한 과정을 N번 반복했을때, 한 변에 있는 가장 작은 정사각형 개수는 2^N과 같다.
		5. 위를 연계하면 모든 점의 개수는 (2^N+1)^2와 같다.
		 */
	}
}
