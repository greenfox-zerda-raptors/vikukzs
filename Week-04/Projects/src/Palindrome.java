/**
 * Created by Zsuzska on 2016. 11. 10..
 */
import java.util.Scanner;

public class Palindrome {

    public static String reverser(String reversed) {
        String result = "";
        for (int i = reversed.length()-1; i >= 0; i--){
            result = result + reversed.charAt(i);
        }
        return result;

    }
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args){

        String answer;
        String prompt = "What do you want to do [1=Test if such is a Palindrome, 0=Quit]?";
        System.out.println(prompt);

        while (input.hasNext()){

            answer  = input.nextLine();

            if (answer.contentEquals("0")){
                System.out.println("Bye!");
                break;
            }
            if (answer.contentEquals("1")) {
                System.out.println("Enter the phrase please?");
                String phrase = input.nextLine();
                String sentenceRev = reverser(phrase);
                System.out.println(sentenceRev);
                if((phrase.replaceAll("\\s","")).contentEquals(sentenceRev.replaceAll("\\s",""))){
                    System.out.println("Yup, that's a palindrome.");
                }
                else {
                    System.out.println("Nope, that's not a palindrome.");
                }
            }
            System.out.println(prompt);
        }


    } // end of MAIN
} // end
