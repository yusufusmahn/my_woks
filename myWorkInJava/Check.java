public class Check{
	public static void main(String[] args){

		int[] score = {2, 5, 9, 4, 7};

		int check = 0;

		System.out.println(elementCheck(score, check));

	}






	public static boolean elementCheck (int[] score, int check){

		for (int i = 0; i < score.length; i++){
			if (check == score[i]){

				return true;
			}
		}

		return false;
	}

}
