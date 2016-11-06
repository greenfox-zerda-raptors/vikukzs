/**
 * Created by Zsuzska on 2016. 11. 06..
 */
public class Workshop17 {
    public static void main(String[] args) {
        String ag = "kuty";
        // write a function that gets a string as an input
        // and appends an 'a' character to its end

        System.out.println(appendA(ag));
    }
    public static String appendA(String a){
        a = a + "a";
        return a;
    }
}
