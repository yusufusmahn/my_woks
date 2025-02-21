import java.util.Arrays;
public class Sorting{
	public static void main(String[] args){

	int[] numbers = {4,2,1,5,3};

	int[] outcome = sortIt(numbers);
	System.out.println(Arrays.toString(outcome));


	}


	public static int[] sortIt(int[] numbers){
		for (int i = 0; i < numbers.length; i++){
			for (int j = 0; j < numbers.length; j++){

				if (numbers[i] < numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;		
	
	}

}


