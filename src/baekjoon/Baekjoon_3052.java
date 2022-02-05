package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baekjoon_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		
//		int[] arr = new int[10];
//		int[] arrRemainder = new int[10]; 
//		int realCount =0;		
//		
//		for(int i =0; i < 10; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//			arrRemainder[i] = arr[i] % 42 ;
//		}
//		
//		for(int i =0; i< arrRemainder.length; i++) {
//			int count = 0;
//			for(int j =i+1; j < arrRemainder.length; j++) {
//				if(j > arrRemainder.length) {
//					break;
//				}
//				if(arrRemainder[i] == arrRemainder[j]) {
//					count += 1;
//				}
//			}
//			if(count == 0) {
//				realCount += 1;
//			}
//		}
//		System.out.println(realCount);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();  //중복된 값 제거
		
		for(int i =0; i<10; i++) {
			h.add(Integer.parseInt(br.readLine())%42 );
		}
		
		System.out.println(h.size());
	}

}
