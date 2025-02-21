import java.util.Arrays;
public class RunningTotal{
	public static void main(String[] args){

		int[] number = {2,3,4,2};


		System.out.println(Arrays.toString(runningTotalOf(number)));

	}



	public static int[] runningTotalOf(int[] number){
		int sum = 0;
		int[] result = new int[number.length];
		for (int i = 0; i < number.length; i++){
			sum += number[i];
			result[i] = sum;

		}

		return result;

	}
}
