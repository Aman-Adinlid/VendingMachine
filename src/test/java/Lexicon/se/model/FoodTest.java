package Lexicon.se.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoodTest {
    private Food test;

    @Before
    public void setup() {
        test = new Food(1, "Potato", 10, 100);
    }

    @Test
    public void Food_Test() {

        Assert.assertEquals(1, test.getProductNumber());
        Assert.assertEquals("Potato", test.getName());
        Assert.assertEquals(10, test.getPrice());
        Assert.assertEquals(100, test.getCalories());
    }


}
