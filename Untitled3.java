import java.util.Arrays;

public class Untitled3{
	public static void main(String[] args){

	int[] values = {1,1,1,2,3,4,5,6,1};

	int target = 1;


	int[] result = uniqueNumber(values, target);
	System.out.println(Arrays.toString(result));

	}


	public static int[] uniqueNumber(int[] numbers, int target){


		int count = 0;
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] != target){
				count++;
		
			}
		}


		int [] outcome = new int[count];
		int counter = 0;
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] != target){
				outcome[counter] = numbers[i];
				counter++;
			}
		}
		return outcome;

	}

}