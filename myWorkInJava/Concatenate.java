import java.util.Arrays;

public class Concatenate{
	public static void main(String[] args){

	int[] numbers = {1,2,3,4,5};
	String[] letters = {"a","b","c","d","e"};

	System.out.println(Arrays.toString(concatenateIt(numbers, letters)));

	}


	public static Object[] concatenateIt(int[] number, String[] letter){

		Object[] result = new Object[number.length + letter.length];
		int count = 0;

		for (int i = 0; i < number.length; i++){
			result[count] = number[i];
			count++;
		}
		for (int i = 0; i < letter.length; i++){
			result[count] = letter[i];
			count++;
		}

		return result;

	}

}