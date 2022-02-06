package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		int[] arr = new int[26];
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < word.length(); i++) {
			if (arr[word.charAt(i) - 'a'] > -1) {
				continue;
			}
			arr[word.charAt(i) - 'a'] = i;
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

}
