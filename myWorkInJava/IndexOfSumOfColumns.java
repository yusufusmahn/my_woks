import java.util.Arrays;

public class IndexOfSumOfColumns{
   public static void main(String[] args){

	int[][]  nums = {{1,2,3},{4,5,6},{7,8,9}};

	int[] result = IndexOfSumOfColumns(nums);
	 System.out.println(Arrays.toString(result));

}




public static int[] IndexOfSumOfColumns(int[][] nums){

		int maxColumnIndex = 0;
		int minColumnIndex = 0;

		int [] storeSum = new int[nums.length];

		for (int j = 0; j < nums[0].length; j++){
			int colSum = 0;
			for (int i = 0; i < nums.length; i++){
				colSum += nums[i][j];
			}
				storeSum[j]= colSum;
                }


		for (int j = 0; j < nums.length; j++){

			if (storeSum[j] > storeSum[maxColumnIndex]){
				maxColumnIndex = j ;

			}

			if (storeSum[j] < storeSum[minColumnIndex]){
				minColumnIndex = j ;

			}
}


		return new int[] {maxColumnIndex,minColumnIndex};


		}

}


