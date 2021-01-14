package Lexicon.se.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DrinkTest {

    private Drink test;

    @Before
    public void setup() {
        test = new Drink(3, "SevenUp", 50, "big");
    }

    @Test
    public void Drink_Test() {

        Assert.assertEquals(3, test.getProductNumber());
        Assert.assertEquals("SevenUp", test.getName());
        Assert.assertEquals(50, test.getPrice());
        Assert.assertEquals("big", test.getVolume());


    }
}
