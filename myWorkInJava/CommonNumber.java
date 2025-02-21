import java.util.Arrays;
public class CommonNumber{
	public static void main(String[] args){

	int[] numbers = {1,2,3,7,7,6};
	int[] check = {7};

	int[] outcome = commonNumber(numbers, check);
	System.out.println(Arrays.toString(outcome));


	}


	public static int[] commonNumber(int[] numbers, int[] check){
		int count = 0;
		for (int i = 0; i < numbers.length; i++){
			for (int j = 0; j< check.length; j++){

			if (numbers[i] != check[j]){
				count++;
			}
}
		}

		int counter = 0;
		int[] result = new int[count];
		for (int i = 0; i < numbers.length; i++){
			for (int j = 0; j < check.length; j++){
			if (numbers[i] != check[j]){

			result[counter] = numbers[i];
				counter++;
			}
}
		}
		return result;		
	
	}

}


