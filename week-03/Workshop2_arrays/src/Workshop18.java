/**
 * Created by Zsuzska on 2016. 11. 06..
 */
public class Workshop18 {
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

        System.out.println(sumNum(100));
    }
    public static int sumNum(int end){
        int sum = 0;
        for (int i = 1; i <= end; i++){
            sum += i;
        }
        return sum;

    }
}
