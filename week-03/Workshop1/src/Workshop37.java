/**
 * Created by Zsuzska on 2016. 11. 03..
 */
public class Workshop37 {
    public static void main(String[] args) {
        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replacable, hence store it in a variable

        String hash = "# ";
        int n;
        int m;
        for (n = 1; n <= 7; n++) {
            for (m = 1; m <= 7; m++) {
                System.out.print(hash);
            }
            if (n % 2 == 0) {
                System.out.println(hash);
            }
            else {
                System.out.println();
            }

        }
    }

}
