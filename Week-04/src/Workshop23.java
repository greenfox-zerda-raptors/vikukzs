/**
 * Created by Zsuzska on 2016. 11. 07..
 */
public class Workshop23 {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("first second third third");
        // Accidentally I inserted the word "third" twice. Your task is to change the last word to "fourth"
        // Expected outpt: first second third fourth
        String theWord="third";
        int i = sb.indexOf(theWord,sb.indexOf(theWord)+1);
        int len = theWord.length();

        sb.replace(i,i+len, "fourth");


        System.out.println(sb.toString());
    }
}
