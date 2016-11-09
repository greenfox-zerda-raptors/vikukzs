/**
 * Created by Zsuzska on 2016. 11. 09..
 */
/**************************************************************************************************
 * Workshop: Practice With Exceptions: Arithmetic Overflow
 * Write a routine that catches an arithmetic overflow (that is, larger than the Integer.MAX_VALUE)
 * Note that Integer and int are NOT the same thing; and that Integer offers you properties such as
 * MAX_VALUE.
 * Use the Scanner routine to take the input from the keyboard; if the value is okay then
 * print "Yum", and then 1/2 the value entered.  For example:-
 * INPUT or 0 to end?  12334556677723131
 * Invalid value
 * (and the Java exception messages)
 * INPUT or 0 to end?  12345678
 * Yum 1234
 * INPUT or 0 to end?  123456
 * Yum 123
 * INPUT or 0 to end? 0
 * Bye!
 **************************************************************************************************/

import java.util.*;

public class Workshop03{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("INPUT or 0 to end?");
        String num = checkValidNum();
        while (!num.contentEquals("0")){
            System.out.print("INPUT or 0 to end?");
            num = checkValidNum();
        }
    } //main
    public static String checkValidNum(){
        try {
            String input = userInput.nextLine();
            Integer parsed = Integer.parseInt(input);
            if (input.contentEquals("0")){
                System.out.println("Bye!");
            }
            else {

                System.out.println("Yum " + input.substring(0, input.length() / 2));
            }
            return input;
        }
        catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Invalid Value");
            return "";
        }

    }
} //Workshop03
