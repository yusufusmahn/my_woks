import java.util.Arrays;

public class Alternating{
	public static void main(String[] args){

	int[] numbers = {1,2,3,4,5};
	String[] letters = {"a","b","c","d","e"};

	System.out.println(Arrays.toString(AlternateIt(numbers, letters)));

	}


	public static Object[] AlternateIt(int[] number, String[] letter){

		Object[] result = new Object[number.length + letter.length];
		int count = 0;
		int numberCount = 0;
		int letterCount = 0;

		while (numberCount < number.length && letterCount < letter.length){
			result[count] = number[numberCount];
			count++;
			result[count] = letter[letterCount];
			count++;
			numberCount++;
			letterCount++;

		}

/*

		while (numberCount < number.length){
			result[count] = number[numberCount];
			count++;
			numberCount++;

		}
	

		while (letterCount < letter.length){
			result[count] = letter[letterCount];
			count++;
			letterCount++;

		}

*/
		return result;

	}

}