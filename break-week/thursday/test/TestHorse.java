import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zsuzsi on 2016. 12. 01..
 */
public class TestHorse {

    private Horse horse;

    @Before
    public void initTest(){
        horse = new Horse("Paci");
    }

    @Test
    public void testFeed() throws Exception {
        int feedCounterBeforeFeed = horse.getFeedcounter();
        horse.feed();
        int feedCounterAfterFeed = horse.getFeedcounter();
        assertEquals(20, feedCounterAfterFeed - feedCounterBeforeFeed);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setChildrenNumValid() throws Exception {
        horse.setChildrenNum(-1);

    }

}
