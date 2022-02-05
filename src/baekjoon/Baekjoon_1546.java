package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1546 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		double[] score = new double[N];
		st = new StringTokenizer(br.readLine(), " "); // 구분문자가 없을떄 공백으로 나눈다.
		for (int i = 0; i < N; i++) {
			score[i] = Double.parseDouble(st.nextToken());

		}
		Arrays.sort(score);

		double Max = score[score.length - 1];
		
		for(int i = 0; i < N; i++) {
				score[i] = score[i] / Max * 100;
		}
		double sum =0;
		double avg = 0;
		for(int i =0 ; i < score.length;i++ ) {
			sum += score[i];
			avg = sum / N;
		}
		avg = sum / N;
		System.out.println(avg);
		
	}

}
