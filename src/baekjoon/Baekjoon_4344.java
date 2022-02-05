package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4344 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] caseArr = new int[Integer.parseInt(br.readLine())];

		for (int i = 0; i < caseArr.length; i++) {
			double sum = 0;
			double avg = 0;
			int count = 0;
			double persent = 0;
			st = new StringTokenizer(br.readLine(), " ");

			int[] student = new int[Integer.parseInt(st.nextToken())]; // st.nextToken(); 주의 학생명 수도 구별 해주어야 하므로 st로 구분

			for (int j = 0; j < student.length; j++) {
				student[j] = Integer.parseInt(st.nextToken());
				sum += student[j];
			}
			avg = sum / student.length;
			for (int j = 0; j < student.length; j++) {
				if (avg < student[j]) {
					count++;
				}
			}
			persent = ((double)count / student.length) * 100;
			System.out.println(String.format("%.3f", persent) + "%");

		}

	}

}
