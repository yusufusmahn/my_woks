public class Array7{
public static void main(String[] args){

	String word = "RaceCar";

	boolean valid = isPalindrome(word);


	if (valid){
	System.out.println( word + " is a palindrome");
	}

	else{
	System.out.println( word + " is not a palindrome");

}
	}

public static boolean isPalindrome (String word){

	word = word.toLowerCase();

	char[] charArray = word.toCharArray();

	int leftHand = 0;
	int rightHand = charArray.length - 1;


	while (leftHand < rightHand){
	if (charArray[leftHand] != charArray[rightHand]){

	return false;

}

	leftHand++;
	rightHand--;

}

	return true;


}
	}