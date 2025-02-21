import java.util.Arrays;

public class Reverse{
	public static void main(String[] args){

	int[] numbers = {1,2,3,4,5};

	System.out.println(Arrays.toString(reversIt(numbers)));

	}


	public static int[] reversIt(int[] number){

		for (int i = 0; i < number.length; i++){
			for (int j = 0; j < number.length; j++){

				if (number[i] > number[j]){
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}

			}
		}
		return number;
	}

}