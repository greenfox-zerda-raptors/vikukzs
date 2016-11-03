/**
 * Created by Zsuzska on 2016. 11. 03..
 */
public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable
        String hash = "# ";
        for (int n = 1; n <= 5; n++) {
            for (int m = 1; m <= 5; m++) {
                    System.out.print(hash);
                }
            System.out.println();
        }
    }
}
