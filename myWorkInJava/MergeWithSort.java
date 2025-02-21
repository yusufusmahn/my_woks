import java.util.Arrays;

public class MergeWithSort{
	public static void main(String[] args){



	int[] one = {5,6,8,7,9};
	int[] two = {1,2,4,3,10};

	
	System.out.println(Arrays.toString(sort(merge(one, two))));


	}



	public static int[] merge(int[] one, int[] two){
	
		int count = 0;
		int[] combine = new int[one.length + two.length];

		for (int i = 0; i < one.length;i++){
			combine[count] = one[i];
			count++;
		}

		for (int i = 0; i < two.length;i++){
			combine[count] = two[i];
			count++;
		}


		return combine;

	}


	public static int[] sort(int[] combine){

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