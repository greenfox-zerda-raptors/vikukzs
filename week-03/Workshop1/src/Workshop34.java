/**
 * Created by Zsuzska on 2016. 11. 03..
 */
public class Workshop34 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".

//        for (int m = 1; m <= 100; m++) {
//            if (m % 3 == 0 && m % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (m % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (m % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(m);
//            }
        String out = "";

        for (int m = 1; m <= 100; m++){
            out = "";

            if (m % 3 == 0){
                out = "Fizz";
            }
            if (m % 5 == 0){
                out += "Buzz";
            }
            if (out == ""){
                out += m;
            }
            System.out.println(out);


        }
    }
}

