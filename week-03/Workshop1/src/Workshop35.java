/**
 * Created by Zsuzska on 2016. 11. 03..
 */
public class Workshop35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567
        for (int n = 1; n <= 7; n++) {
            for (int m = 1; m <= 7; m++) {
                if (m <= n){
                    System.out.print(m);
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }



    }
}
