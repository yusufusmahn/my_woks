import java.util.Arrays;
public class Calculate{
	public static void main(String[] args){

		int[] firstNumber = {2,3,4,2};
		int[] secondNumber = {5,3,4,2,9,6};

		System.out.println(mean(firstNumber,secondNumber));
		System.out.println(Arrays.toString(median(firstNumber,secondNumber)));



	}


	public static double mean(int[] firstNumber, int[] secondNumber){
		double result = 0;
		int sum = 0;
		int[] merge = new int[firstNumber.length + secondNumber.length];
		int count = 0;
		for (int i = 0; i < firstNumber.length; i++){
			merge[count] = firstNumber[i];
			count++;
		}

		for (int i = 0; i < secondNumber.length; i++){
			merge[count] = secondNumber[i];
			count++;
		}


		int counter = 0;
		for(int i = 0; i < merge.length; i++){
			sum += merge[i];
			counter++;
		}


		 result = (double) sum / counter;
	
		 return result;	

	}




	public static int[] median(int[] firstNumber, int[] secondNumber){

		int sum = 0;
		int[] merge = new int[firstNumber.length + secondNumber.length];
		int count = 0;
		for (int i = 0; i < firstNumber.length; i++){
			merge[count] = firstNumber[i];
			count++;
		}

		for (int i = 0; i < secondNumber.length; i++){
			merge[count] = secondNumber[i];
			count++;
		}


		for (int i = 0; i < merge.length; i++){
			for (int j = 0; j < merge.length; j++){
				if (merge[i] < merge[j]){
					int temp = merge[i];
					merge[i] = merge[j];
					merge[j] = temp;

				}
			}
		}

			int result = 0;
			if (merge.length % 2 == 1){
				result = merge.length / 2;

			}

		
			return result;
			
		

		}
		






	//public static int[] mode(int[] firstNumber, int[] secondNumber){





	//}





}
