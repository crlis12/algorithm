package backjoon;

public class Backjoon_15596 {
	long sum(int[] a) {
		int sum =0;
		
		
		for(int i=0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
