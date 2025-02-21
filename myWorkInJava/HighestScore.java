
import java.util.Arrays;

public class HighestScore{
	public static void main(String[] args){

		int[][] score = {{1,2,3,4,5},{6,7,8,9,10}};
	
		System.out.println(Arrays.toString(HighestScore(score)));
	}





	public static int[] HighestScore(int[][] number){
		int[] result = new int[number[0].length];
		int indexLow = Integer.MAX_VALUE;
		int indexHigh = Integer.MIN_VALUE;
			int low = 0;
			int high = 0;

		for (int i = 0; i < number[0].length; i++){
			int sum = 0;
			for (int k = 0; k < number.length; k++){
				sum += number[k][i];
				result[i] = sum; 	
			}
				if (result[i] > indexHigh){
					indexHigh = result[i];
					high = i;
				}
	
				if (result[i] < indexLow){
					indexLow = result[i];
					low = i;
				}
		}

		return new int[] {low, high};


	}


}