import java.util.Arrays;
public class DigitsList{
	public static void main(String[] args){

		int number = 2342;


		System.out.println(Arrays.toString(digitsList(number)));

	}



	public static int[] digitsList(int number){
		int length = 0;
		int temp = number;

		while (temp > 0){
			temp /= 10;
			length++;

		}

		
		
		int[] result = new int[length];
		int count = length - 1;
		while(number > 0){
			result[count] = number % 10;
			number /= 10;
			count--;
		}

		return result;

	}
}
