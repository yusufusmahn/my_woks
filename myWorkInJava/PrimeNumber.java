
public class PrimeNumber{

	public static void main(String[] args){
	
	System.out.println(primeNumber(10));
	
	}



	public static int primeNumber(int numbers){
		int result = 0;

		for (int i = 2; i < numbers; i++){

			if (numbers % i != 0){
				result++;
			}
		}
		return result;
		
	}


}