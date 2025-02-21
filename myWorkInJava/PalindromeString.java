public class PalindromeString{
	public static void main(String[] args){

		String word = "RACECAR";

		System.out.println(isPalindrome(word));

	}


	public static boolean isPalindrome(String word){

		char[] convert = word.toCharArray();
		int left = 0;
		int right = convert.length - 1;

		while(left < right){
			if (convert[left] != convert[right]){
				return false;
			}
			left++;
			right--;

		}

		return true;
		
	}
}
