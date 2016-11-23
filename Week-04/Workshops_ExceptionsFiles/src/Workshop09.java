/**
 * Created by Zsuzska on 2016. 11. 10..
 */
import java.util.*;

public class Workshop09{

    static int myMethod(int inNumber) throws Exception {

        if (inNumber == 7) {// do that thing that chucks the reprobate out
            throw new Exception("7s are cannibals");
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
