
public class Untitled2{

	public static void main(String[] args){
	
	System.out.println(primeNumber(7));
	
	}



	public static boolean primeNumber(int numbers){
		
		if (numbers <= 1){
		return false;

		}

		for (int i = 2; i < numbers; i++){

			if (numbers % i == 0){
				return false;
			}
		}
		return true;
	}


}