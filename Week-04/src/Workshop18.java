/**
 * Created by Zsuzska on 2016. 11. 07..
 */
public class Workshop18 {
    public static void main(String... args){
        StringBuilder example = new StringBuilder("A long example string");

        example.replace(2, 6, "short");
        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected ouput: A short example string


        System.out.println(example);
    }
}
