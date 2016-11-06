/**
 * Created by Zsuzska on 2016. 11. 04..
 */
public class Workshop14 {
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        int a = 0, b = 4;
        int c = 1, d = 3;
        int temp1 = ah[a];
        ah[a] = ah[b];
        ah[b] = temp1;
        int temp2 = ah[c];
        ah[c] = ah[d];
        ah[d] = temp2;

        for(int i=0;i<5;i++){
            System.out.print(ah[i] + " ");
        };

        System.out.println();
    }
}
