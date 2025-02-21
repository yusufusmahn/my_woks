public class SubstringCheck {

    public static void main(String[] args) {
        System.out.println(isSubstring("ABCD", "BC"));          System.out.println(isSubstring("ABCD", "BDC")); 
    }

    public static boolean isSubstring(String firstInput, String secondInput) {
        if (secondInput.length() > firstInput.length()) {
            return false;
        }

        for (int i = 0; i <= firstInput.length() - secondInput.length(); i++) {
            for (int j = 0; j < secondInput.length(); j++) {
                if (firstInput.charAt(i + j) != secondInput.charAt(j)) {
                    break;  
                }
                if (j == secondInput.length() - 1) {
                    return true;
                }
            }
        }

        return false; 
    }
}
