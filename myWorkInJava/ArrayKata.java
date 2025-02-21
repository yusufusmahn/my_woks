import java.util.Arrays;
public class ArrayKata{
	public static void main(String[] args){

		int[] score = {1,2,3,4,5};

		System.out.println(Arrays.toString(largest(score)));
		System.out.println(Arrays.toString(secondMax(score)));
		System.out.println(Arrays.toString(secondSmall(score)));
		System.out.println(Arrays.toString(multiply(score)));
		System.out.println(Arrays.toString(mul(score)));
		System.out.println(Arrays.toString(mult(score)));
		System.out.println(Arrays.toString(even(score)));
		System.out.println(Arrays.toString(evennosin(score)));







	}


	public static int[] largest (int[] number){
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < number.length; i++){
			if (number[i] > max){
				max = number[i];

			}
		}

		return new int[]{max};
	}


	public static int[] secondMax(int[] number){
		int max = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < number.length; i++){
			if (number[i] > max){
				secondLargest = max;
				max = number[i];
			}
			if (number[i] > secondLargest && number[i] != max){
				secondLargest = number[i];
			}
		}

		return new int[] {max,secondLargest};

	}



	public static int[] secondSmall(int[] value){

		int secondSmallest = Integer.MAX_VALUE;
		int least = Integer.MAX_VALUE;

		for (int i = 0; i < value.length; i++){
			if (value[i] < least){
				secondSmallest = least;
				least = value[i];
			}

			if(value[i] < secondSmallest && value[i] != least){
			secondSmallest = value[i];

			}
			}

			return new int[] {least,secondSmallest};
	}


	public static int[] multiply(int[] number){

	int[] result = new int[number.length];

	for (int i = 0; i < number.length; i++){

	result[i] = number[i] * number[i];


	}

	return result;



	}



	public static int[] mul(int[] number){

	int[] result = new int[number.length];
	int sum = 0;

	for (int i = 0; i < number.length; i++){

	 sum += number[i] * number[i];

	result[i] = sum;


	}

	return result;



	}






	public static int[] mult(int[] number){

	int sum = 0;

	for (int i = 0; i < number.length; i++){

	 sum += number[i] * number[i];

	}

	return new int[] {sum};



	}



	public static int[] even(int[] number){

	int sum = 0;

	for (int i = 0; i < number.length; i++){
	
		if(number[i] % 2 == 0){

	}
			return new int[] {number[i]};

	}

	return new int[] {};



	}



public static int[] evennosin(int[] number){
	int count = 0;

	for (int i = 0; i < number.length; i++){
	
		if(number[i] % 2 == 0){
		count++;

	}
	}

		int[] result = new int[count];
		int k = 0;
	for (int j = 0; j < number.length; j++){
		if(number[j] % 2 == 0){
		result[k] = number[j];
		k++;

		}
	}

	return result;



	}


}