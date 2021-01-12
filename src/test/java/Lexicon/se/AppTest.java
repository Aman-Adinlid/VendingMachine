package Lexicon.se;

import static org.junit.Assert.assertTrue;

import Lexicon.se.data.VendingMachineImpl;
import Lexicon.se.model.Product;
import org.junit.Assert;
import org.junit.Test;


public class AppTest {
    VendingMachineImpl VendingMachineImplTest = new VendingMachineImpl();

    @Test
    public void Test_EqualsTrue() {
        Assert.assertTrue(VendingMachineImplTest.addCurrency(20));
    }
}


