package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Baekjoon_2753 {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		
		if(a % 4 == 0 && a % 100 != 0 ) {
			System.out.println("1");
		}else if(a % 4 == 0 && a % 400 ==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}