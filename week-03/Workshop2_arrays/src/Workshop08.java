import java.util.Arrays;

/**
 * Created by Zsuzska on 2016. 11. 04..
 */
public class Workshop08 {
    public static void main(String[] args) {
        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

        // Task 2: Print this two dimensional array to the output
        int[][] task = new int [4][4];
        int i;
        String s;
        for (i = 0; i < 4; i++){
            task[i][i] = 1;
        }
        for (i = 0; i < task.length; i++){
            s = "";
            for (int j = 0; j < task.length; j++){
                s = s + task[i][j] + " ";
            }
            System.out.println(s);
        }

    }
}
