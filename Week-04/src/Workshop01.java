import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zsuzska on 2016. 11. 07..
 */
public class Workshop01 {
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        // Add multiple elements to the list and print the number of the elements
        arrayList.add("egy");
        arrayList.add("ketto");
        arrayList.add("harom");

        System.out.println(arrayList.size());
    }
}
