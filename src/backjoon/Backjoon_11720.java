package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		int sum = 0;
		String numStr = br.readLine();
		
		for(int i =0; i < N; i++) {
			sum += numStr.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
