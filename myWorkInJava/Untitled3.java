/*
public class Untitled3{

   public static void main(String[] args){

	int[][]  nums = {{1,2,3},{4,5,6},{7,8,9}};


	}

   public static int rowsAndColumns(int[][] nums)

}


*/



public class Untitled3{
   public static void main(String[] args){

	int[][]  nums = {{1,2,3},{4,5,6},{7,8,9}};
				int rowSum = 0;
		for (int i = 0; i < nums.length; i++){
			for (int j = 0; j < nums.length; j++){
				rowSum += nums[i][j];
			}
	 System.out.println("the sum of row "+(i+1) + " is "+rowSum);


                }
System.out.println();


		for (int j = 0; j < nums[0].length; j++){
			int columnSum = 0;
			for (int i = 0; i < nums.length; i++){
				columnSum += nums[i][j];
			}
	 System.out.println("the sum of column "+(j+1) + " is "+columnSum);


                }



   }
}

