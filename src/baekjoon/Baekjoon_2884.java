package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Baekjoon_2884 {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(B - 45 >=0) {
			System.out.print(A+" "+ (B - 45));
		}else if(A == 0 && B - 45 < 0){
			System.out.println("23"+" "+(60-(45-B)));
		}else {
			System.out.println((A-1)+" "+(60-(45-B)));
		}
	}
}
