import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public class Apple {
    String name = "apple";


    public String getName() {
        return name;
    }

    public static int sumOfList(ArrayList<Integer> a){
        int sum = 0;

//        for (int i = 0; i < a.size(); i++){
//            sum = sum + a.get(i);
//        }
        for (Integer b : a) {
            sum += b;
        }
        return sum;
    }

    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,5,8,13,21));
        System.out.println(sumOfList(list));

        for (int counter = 0; counter <= 9; counter++){
            System.out.printf("Fibonacci of %d is: %d\n",
                    counter, fibonacci(counter));
        }
    }
}
