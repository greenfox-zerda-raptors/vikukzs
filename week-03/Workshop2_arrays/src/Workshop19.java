/**
 * Created by Zsuzska on 2016. 11. 06..
 */
public class Workshop19 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial

        System.out.println(factorial(7));
    }

        public static int factorial(int end){
        int fact = 1;
        for (int i = 1; i <= end; i++){
            fact *= i;
        }
        return fact;
    }
}
