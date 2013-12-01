package task6_tests;

import org.junit.Test;
import task4.Flower;
import task4.FlowerUtils;
import task4.Main;

import static junit.framework.Assert.assertEquals;


public class FlowerUtilsTest extends Main{
    @Test
    public void testJoin() throws Exception {
        FlowerUtils a = new FlowerUtils();

        Flower[] bouquet1 = {rose, tulip, camomile};   // where keep that data? why it's unable to get it from Main class?
        Flower [] bouquet2 = {rose, sunflower, camomile};
        Flower []expResult =  {rose, tulip,  camomile, rose, sunflower, camomile};

        Flower [] res = a.join(bouquet1, bouquet2);
        assertEquals(res, expResult);
    }
}
