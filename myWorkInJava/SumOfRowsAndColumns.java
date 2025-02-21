import java.util.Arrays;
public class SumOfRowsAndColumns{

	public static void main(String[] args){

	int[][]  numbers = {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("sum of rows: "+Arrays.toString(sumOfRows(numbers)));
	System.out.println("sum of columns: "+Arrays.toString(sumOfColumns(numbers)));
	System.out.println("index of sum of rows: "+Arrays.toString(rowSumIndex(numbers)));



	}



	public static int[] rowSumIndex(int[][] numbers){
		int index = 0;
		int largest = Integer.MIN_VALUE;
		int [] store = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++){
			int rowSum = 0;
			for (int j = 0;  j < numbers.length; j++){
				rowSum += numbers[i][j];
				store[i] = rowSum;
			}
		}

			for (int i = 0; i < numbers.length; i++){
				if (store[i] > store[index]){
					index = i;
				}
			}

	return new int[]{index};
}


	public static int[] sumOfRows(int[][] numbers){

		int [] result = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++){
			int rowSum = 0;
			for (int j = 0;  j < numbers.length; j++){
				rowSum += numbers[i][j];
				result[i] = rowSum;
			}
		}
	return result;
}

	public static int[] sumOfColumns(int[][] numbers){
			int [] outcome = new int[numbers.length];

			for (int j = 0; j < numbers[0].length; j++){
				int columnSum = 0;
				for (int i = 0;  i < numbers.length; i++){
					columnSum += numbers[i][j];
					outcome[j] = columnSum;
				}
			}

		return outcome;
	}
}