package programmers;

public class KeypadDown {
	public static String solution(int[] numbers, String hand) {

		String answer = "";

		int lefthand = 10; // *
		int righthand = 12; // #
		int leftLenth = 0;
		int rightLenth = 0;
		//
		for (int number : numbers) {
			if (number == 1 || number == 4 || number == 7) {
				answer = answer.concat("L");
				lefthand = number;
			} else if (number == 3 || number == 6 || number == 9) {
				answer = answer.concat("R");
				righthand = number;
			} else { // 중앙일때
				leftLenth = numberLength(lefthand, number);
				rightLenth = numberLength(righthand, number);
				
				
				
				if (leftLenth > rightLenth) {
					answer = answer.concat("R");
					righthand =number;
				} else if(leftLenth < rightLenth){
					answer = answer.concat("L");
					lefthand = number;
				}else {
					if (hand.equals("right")) {
						answer = answer.concat("R");
						righthand = number;
					} else if(hand.equals("left")) {
						answer = answer.concat("L");
						lefthand = number;
					}
				}
				
				
			}
		}
		return answer;

	}

	public static int numberLength(int currenthand, int key) {
		int x = 0;
		int y = 0;
		int k = 0;
		int z = 1;
		int indexLenth = 0;
		int[][] keypad = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 0, 12 } };
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (keypad[i][j] == currenthand) {
					x = i;
					y = j;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
				if (keypad[i][1] == key) {
					k = i;
			}
		}

		indexLenth = Math.abs(x - k) + Math.abs(y - z);
		return indexLenth;
	}

	public static void main(String[] args) {
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "leftsssss";

		//LRLLLRLLRRL
		//LRLLLRLLRRL
		
		//LRLLRRLLLRR 맞는값
		//LRLRLRLLLRR

		KeypadDown keypad = new KeypadDown();
		System.out.println(keypad.solution(numbers, hand));
	}
	

}
