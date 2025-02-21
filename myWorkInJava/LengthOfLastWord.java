public class LengthOfLastWord {

	public static void main(String [] args){

	System.out.println(LengthOfLastWord("hello world"));

	}



public static int LengthOfLastWord(String words){
	words = words.trim();


	int lastLength = 0;

	for (int i = words.length()-1; i >= 0; i--){
		if (words.charAt(i) == ' '){
			break;
		}

		lastLength++;
	}

		return lastLength;
	}





}