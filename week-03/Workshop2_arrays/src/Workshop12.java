/**
 * Created by Zsuzska on 2016. 11. 04..
 */
public class Workshop12 {
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected outpt: third second first
        String[] abc = new String[] { "first", "second", "third" };
        int a = 0, b = 2;
        String temp = abc[a];
        abc[a] = abc[b];
        abc[b] = temp;

        for(int i = 0; i < abc.length; i++){
            System.out.print(abc[i] + " ");
        }
    }
}
