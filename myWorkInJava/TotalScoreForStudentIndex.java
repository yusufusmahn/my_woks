import java.util.Arrays;
public class TotalScoreForStudentIndex{
	public static void main(String[] args){

	int[][] nums = {{30,40,50},{10,20,50}};

	System.out.println(Arrays.toString(TotalScoreForStudentIndex(nums)));
	}



	public static int[] TotalScoreForStudentIndex(int[][] nums){

		int highestScoreIndex = 0;
		int lowestScoreIndex = 0;

		int[] result = new int[nums[0].length];

		for (int j = 0; j < nums[0].length; j++){
			int sum = 0;
			for (int i = 0; i < nums.length; i++){
				sum += nums[i][j];
				result[j] = sum;
			}
		}
		for (int j = 0; j < nums[0].length; j++){
			if (result[j] > result[highestScoreIndex]){
				highestScoreIndex = j;
			}
			if (result[j] < result[lowestScoreIndex]){
				lowestScoreIndex = j; 
			}
		}

		return new int[] {highestScoreIndex,lowestScoreIndex};


	}

}