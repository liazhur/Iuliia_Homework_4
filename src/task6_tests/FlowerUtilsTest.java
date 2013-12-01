package task6_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task4.Flower;
import task4.FlowerUtils;
import task4.Main;

import java.util.Arrays;
import java.util.Random;

import static junit.framework.Assert.assertEquals;

public abstract class FlowerUtilsTest {
//    private Flower[] flowers1 ;
//    private Flower[] flowers2 ;
//    private Flower[] flowers;
//
//    private Random random = new Random();
//    private Flower.FlowerBuilder flowerBuilder = new Flower.FlowerBuilder();
//
//    @Before
//    public void setUp () {
//        flowers = new Flower[3];
//        flowers [0] = flowerBuilder.flowerPrice(1).build();
//        flowers [1] = flowerBuilder.flowerPrice(2).build();
//
//        flowers1 = new Flower[] {flowers[0] , flowers[1]};
//        flowers2 = new Flower[] {flowers[1] , flowers[2]};
//    }
//
//    @Test
//    public void testJoin() throws Exception {
//        Flower[] actualFlowers = FlowerUtils.join (flowers1 , flowers2);
//
//        assertEquals (flowers[0] , actualFlowers[0]);
//        assertEquals (flowers[1] , actualFlowers[1]);
//        assertEquals (flowers[1] , actualFlowers[2]);
//        assertEquals (flowers[2] , actualFlowers[3]);
//    }
    Flower rose = new Flower.FlowerBuilder()
             .flowerColor("Red")
             .flowerName("Rose")
             .flowerPrice(25)
             .flowerSize(70)
             .build();

    Flower wildRose = new Flower.FlowerBuilder()
            .flowerColor(rose.getFlowerColor())
            .flowerName(rose.getFlowerName())
            .flowerPrice(rose.getFlowerPrice())
            .flowerSize(rose.getFlowerSize())
            .build();

    Flower tulip = new Flower.FlowerBuilder()
            .flowerColor("Yellow")
            .flowerName("Tulip")
            .flowerPrice(10)
            .flowerSize(30)
            .build();

    Flower sunflower = new Flower.FlowerBuilder()
            .flowerColor("Yellow")
            .flowerName("Sunflower")
            .flowerPrice(15)
            .flowerSize(100)
            .build();

    Flower camomile = new Flower.FlowerBuilder()
            .flowerColor("White")
            .flowerName("Camomile")
            .flowerPrice(12)
            .flowerSize(50)
            .build();

    Flower [] bouquet1 = {rose, tulip, camomile};
    Flower [] bouquet2 = {rose, sunflower, camomile};

    @Test
    public void testJoin() throws Exception {
        Flower [] joinedArr = FlowerUtils.join(bouquet1, bouquet2);
        Flower [] forTestJoinedArr = new Flower[] {rose, tulip,  camomile, rose, sunflower};

        Arrays.sort(joinedArr);
        Arrays.sort(forTestJoinedArr);

        joinedArr.equals(forTestJoinedArr);
        return joinedArr.compareTo(forTestJoinedArr);
           }

//    public void testJoinDistinct()  throws Exception {
//        Flower [] joinedArr = FlowerUtils.join(bouquet1, bouquet2);
//        Flower [] joinDistinct = FlowerUtils.joinDistinct(joinedArr);
//        Flower [] forTestJoinDistinct = new Flower[] {rose, tulip,  camomile, sunflower};
//
//        joinDistinct.equals(forTestJoinDistinct);
//    }

//    public void testCommonVal()  throws Exception {
//        Flower [] commonVal = FlowerUtils.commonVal(bouquet1,bouquet2);
//        Flower [] forTestCommonVal = new Flower[] {rose,  camomile};
//
//        commonVal.equals(forTestCommonVal);
//    }

//    public void testOuterArr()  throws Exception {
//        Flower [] outerArr = FlowerUtils.outerVal(bouquet1, bouquet2);
//        Flower [] forTestOuterArr = new Flower[] {tulip, sunflower};
//
//        assertEquals(outerArr, forTestOuterArr);



  //  public void testLeftJoinArr()  throws Exception {
//        Flower [] leftJoinarr = FlowerUtils.leftJoin(bouquet1,bouquet2);
//        Flower [] forTestLeftJoinArr = new Flower[] {rose, rose, tulip, camomile, camomile};
//
//
//        assertEquals(leftJoinarr,forTestLeftJoinArr);

    }







