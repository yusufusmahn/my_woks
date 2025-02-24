import java.util.Arrays;

public class Array6 {
public static void main(String[] args){

int[] digits = {2, 5, 8, 3, 6};
int[] runningTotal = runningTotalOf(digits);

System.out.println("the running total is: "+Arrays.toString(runningTotal));

}


public static int[] runningTotalOf (int[] digits){
	int sum = 0;
	int[] runningTotal = new int [digits.length];
	for(int i = 0; i < digits.length; i++){
	sum += digits[i];
	runningTotal[i] = sum;
}
	return runningTotal;

}



	}