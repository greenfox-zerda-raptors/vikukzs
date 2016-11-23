/**
 * Created by Zsuzska on 2016. 11. 07..
 */
public class Workshop22  {


    public static void main(String[] args)

    {
                                            //000000000011111111111222
                                            //012345678901234567890123
        StringBuilder sb = new StringBuilder("first second third third");
        // Accidentally I inserted the word "third" twice. Your task is to change the last word to "fourth"
        // Expected outpt: first second third fourth
        String theWord="third";
        int i = sb.indexOf(theWord,sb.indexOf(theWord)+1);
        int len = theWord.length();
        System.out.println("i ="+i + " len="+ len);

        System.out.println(sb.toString());
//        sb.replace(sb.indexOf("third", i), i+5, "fourth");
        sb.replace(i,i+len, "fourth");

        System.out.println(sb.toString());
    }
}
