package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon_2577 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int result = A * B * C;

		int[] arr = new int[10];

		String resultArr = String.valueOf(result);

		for (int i = 0; i < resultArr.length(); i++) {
			arr[resultArr.charAt(i) - '0']++;
		}

		for (int x : arr) {
			System.out.println(x);
		}

	}

}
