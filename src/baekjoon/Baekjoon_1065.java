package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		System.out.println(check(N));

	}

	public static int check(int num) {
		int count = 0;

		if (num < 100) {
			return num;
		} else {
			count = 99;
			if (num == 1000) {
				num = 999;
			}
			for (int i = 100; i <= num; i++) {
				int third = i / 100;	// 세번째 자리수
				int second = (i / 10) % 10; // 두번쨰 자리수
				int first = i % 10; // 첫번쨰 자리수

				if ((third - second) == (second - first)) {
					count++;
				}
			}
			return count;
		}
		
	}

}
