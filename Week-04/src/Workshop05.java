import java.util.*;

/**
 * Created by Zsuzska on 2016. 11. 07..
 */
public class Workshop05 {
    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array
        Integer[] a = numList.toArray(new Integer[numList.size()]);
        System.out.println(numList);
    }
}
