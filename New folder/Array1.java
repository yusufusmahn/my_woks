public class Array1 {

public static int largestNumber (int[] number){
	int largestElement = number[0];
	for (int value: number){
	if (value > largestElement){
	largestElement = value;
}
}
	return largestElement;
}




public static void main(String[] args){

int[] number = {12, 45, 67, 89, 90, 34, 0, -77, -22, 20};

System.out.printf("The largest element is: %d%n",largestNumber(number));



}
	}