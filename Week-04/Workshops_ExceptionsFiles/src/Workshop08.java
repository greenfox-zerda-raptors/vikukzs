/**
 * Created by Zsuzska on 2016. 11. 10..
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Having raised exceptions, then what?  I'm looking to get some
 * closure here.  "Finally" would do... whatever else, this is what I need if something goes
 * wrong...
 *
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop08{

    static int myMethod(int inNumber) throws Exception {

        if (inNumber == 7) {// do that thing that chucks the reprobate out
            throw new Exception("I TOLD YOU NOT TO FUCKING WRITE SEVEN!");
        }

        return 100/inNumber-7;
    }// myMeth end

    public static void main(String  args[]){
        Scanner userInput = new Scanner(System.in);
        int shit;

        String prompt = "Do NOT write 7!";
        System.out.println(prompt);
        while (userInput.hasNextInt()) {

            shit = userInput.nextInt();
            if (shit == 0) {
                break;
            } else {
                try {
                    System.out.println("try - first statement");
                    myMethod(shit);
                    System.out.println("try - last statement");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                finally {
                    System.out.println("Finally i did this instead");
                }
            }
        } //while
        System.out.println("::::FINISH LINE::::");
    } // main end

} //ws08 end

