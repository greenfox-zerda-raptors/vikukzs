/**
 * Created by Zsuzska on 2016. 11. 07..
 */
import java.util.*;

public class Workshop13{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list using a for loop and an Iterator
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}

