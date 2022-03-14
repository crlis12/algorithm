package programmers;

import java.util.Arrays;

public class H_index {
	public int solution(int[] citations) {
        
        Arrays.sort(citations);
        int mid = 0;
        if(citations.length % 2 != 0) {
        	mid = citations.length / 2 + 1;
        }else {
        	mid = citations.length / 2;
        }
        int count =0;
        for(int i = mid; i < citations.length - 1; i++) {
        	if(citations[i] <= citations[i+1]) {
        		count++;
        	}
        }
        
        
        if(count == citations[mid] && count == mid ) {
        	return mid;
        }
        
        return citations.length;
        
    }
	public static void main(String[] args) {
		H_index h_index = new H_index();
		int[] test= {3, 4, 5, 11, 15, 16, 17, 18, 19, 20};
		
		System.out.println(h_index.solution(test));
	}
	
}
