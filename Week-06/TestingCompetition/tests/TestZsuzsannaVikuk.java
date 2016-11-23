import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public class TestZsuzsannaVikuk {
    @Ignore
    @Test
    public void isAnAnagram() throws Exception {

    }

    @Test
    public void countHowMany1() throws Exception {
        WordToolbox wSource = new WordToolbox ("Me Tarzan, You Jane");
        assertEquals(3, wSource.countHowMany('a'));
        assertEquals(1, wSource.countHowMany('T'));
        assertEquals(0, wSource.countHowMany('t'));
        assertEquals(0, wSource.countHowMany('x'));
    }

    @Test
    public void countHowMany() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        assertEquals(3, wSource.countHowMany('a'));
        assertEquals(1, wSource.countHowMany('T'));
        assertEquals(1, wSource.countHowMany('t'));
        assertEquals(0, wSource.countHowMany('x'));
    }
}
