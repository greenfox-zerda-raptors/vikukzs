import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class TestApple {

    @Test
    public void testAdd() {
        assertEquals(5, Apple.add(2, 3));
    }

    @Test
    public void testMax() {
        assertEquals(5, Apple.max_of_three(3, 4, 5));
    }
}