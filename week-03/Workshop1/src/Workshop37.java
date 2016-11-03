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
        String space= " ";
        for (int n = 1; n <= 7; n++) {
            for (int m = 1; m <= 7; m++) {
                    System.out.print(hash);
            }
            System.out.println();
        }
//        String out = "#";
//        int i;
//        int y;
//        for (y = 0; y < 7; y++) {
//            if (y % 2 != 0) {
//                System.out.print(" ");
//            }
//            for (i = 0; i <= 7; i++) {
//                if (i != 7) {
//                    System.out.print(out + " ");
//                } else {
//                    System.out.println("");
//                }
//            }
//        }
    }

}
