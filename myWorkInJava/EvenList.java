import java.util.Arrays;
public class EvenList{
	public static void main(String[] args){

		int[] number = {2,3,4,2,8,3,6,10,9};


		System.out.println(Arrays.toString(evenNo(number)));

	}



	public static int[] evenNo(int[] number){
		int count = 0;
		int counter = 0;
		for (int i = 0; i < number.length; i++){
			if (number[i] % 2 == 0){
				counter++;
			}
		}

		int[] result = new int[counter];
		for (int i = 0; i < number.length; i++){
			if (number[i] % 2 == 0){
				result[count] = number[i];
				count++;
			}

		}

		return result;

	}
}
