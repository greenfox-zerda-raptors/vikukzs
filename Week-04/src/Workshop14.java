/**
 * Created by Zsuzska on 2016. 11. 07..
 */
import java.util.*;

public class Workshop14{
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!
        ListIterator<String> it = al.listIterator();
        while (it.hasNext()){
            String o = it.next();
            String a ="a";
            it.set(o+"a");
        }


        System.out.println(al);
    }
}
