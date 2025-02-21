import java.util.Arrays;
public class MergeAndSort{
	public static void main(String[] args){

	int[] firstNumber = {4,2,1,5,3};
	int[] seconNumber = {6,9,10,8,7};

	System.out.println(Arrays.toString(sortIt(MergeIt(firstNumber,seconNumber))));


	}

	public static int[] MergeIt(int[] firstNumber,int[] secondNumber){
		int count = 0;
		int[] combine = new int[firstNumber.length + secondNumber.length];

		for (int i = 0; i < firstNumber.length; i++){
			combine[i] = firstNumber[i];
			count++;
		}

		for (int i = 0; i < secondNumber.length; i++){
			combine[count + i] = secondNumber[i];
		}
		return combine;


	}



	public static int[] sortIt(int[] combine){
		for (int i = 0; i < combine.length; i++){
			for (int j = 0; j < combine.length; j++){

				if (combine[i] < combine[j]){
					int temp = combine[i];
					combine[i] = combine[j];
					combine[j] = temp;
				}
			}
		}
		return combine;		
	
	}

}


