package Lexicon.se.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SnackTest {

    private Snack test;

    @Before
    public void setup() {

        test = new Snack(2, "PopCorn", 20, 5);

    }

    @Test
    public void Snack_Test() {

        Assert.assertEquals(2, test.getProductNumber());
        Assert.assertEquals("PopCorn", test.getName());
        Assert.assertEquals(20, test.getPrice());
        Assert.assertEquals(5, test.getSugarPercent());
    }


}
