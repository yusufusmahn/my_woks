public class Untitled{

	public static void main(String[] args){

/*

	for (int i = 1; i <= 10; i++){

		for (int j = 1; j <= 10; j++){
			System.out.print(i * j + " ");

		}
			System.out.println();
	}



*/
	//int[][] nums = new int[3][4];

	int[][] nums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}};

	for (int i = 0; i < 3; i++){
		//int sum = 0;
		int max = nums[i][0];


		for (int j = 1; j < 3; j++){

		if (nums[i][j] > max){

		max = nums[i][j];
		}

		//sum += nums[i][j];

	}
	System.out.println("row " + (i + 1) + ": "+max);


				//System.out.println();

}
























	}


}