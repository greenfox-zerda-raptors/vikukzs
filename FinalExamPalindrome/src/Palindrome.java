/**
 * Created by Zsuzska on 2017. 02. 17..
 */
public class Palindrome {

     public static String reverser(String reversed) {
         String result = "";
         for (int i = reversed.length()-1; i >= 0; i--) {
             result = result + reversed.charAt(i);
         }
         return result;
     }

     public static Boolean isStringPalindrome(String stringToBeDetermined) {
         stringToBeDetermined.toLowerCase();
         if ((stringToBeDetermined.replaceAll("\\s", "")).contentEquals(reverser(stringToBeDetermined).replaceAll("\\s", ""))) {
             return true;
         } else {
             return false;
         }
     }

    public static void main(String[] args) {
        String string = "this is an exam";
        if (isStringPalindrome(string) == true) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }

    }


}
