import java.util.Arrays;
public class Untitled{
	public static void main(String[] args){

	int[] numbers = {1,2,3,4,5};
	int[] result = convert(numbers);
	System.out.println(Arrays.toString(result));


	}

	public static int[] convert(int[] numbers){
		
		int [] outcome = new int [numbers.length];

		for (int i = 0; i < numbers.length; i++){
			if(numbers[i] % 2 == 0){
				outcome[i] = 0;
			}
			if (numbers[i] % 2 != 0){
				outcome[i] = 1;

			}

		}
			return outcome;
	}



}