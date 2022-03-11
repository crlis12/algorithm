package programmers;

import java.util.PriorityQueue;

public class HotFood {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for (int i : scoville) {
            pQueue.offer(i);
        }

        while (pQueue.peek() < K) {
            //System.out.println(pQueue);

            if (pQueue.size() == 1) {
                return -1;
            }

            Integer a = pQueue.poll();
            Integer b = pQueue.poll();

            pQueue.offer(a + (b * 2));

            answer++;
        }

        return answer;
    }
    
    public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		HotFood hotFood = new HotFood();
		
		System.out.println(hotFood.solution(scoville, 7));
		
	}
    
    
}