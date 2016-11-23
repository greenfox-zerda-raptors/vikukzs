import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public class AppleTest {
    @Test
    public void fibonacci() throws Exception {
        assertEquals(1, Apple.fibonacci(1));
    }

    @Test
    public void sumOfListTest() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5,8,13,21));
        assertEquals(53, Apple.sumOfList(list));

    }


    @org.junit.Test
    public void getName() throws Exception {
        Apple myObject = new Apple();
        assertEquals("apple", myObject.getName()); //what im looking for, what im expecting to get
    }


}