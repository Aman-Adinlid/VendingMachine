package Lexicon.se.data;

import Lexicon.se.model.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineImplTest {

    VendingMachineImpl vendingMachine;

    @Before

    public void before() {

        vendingMachine = new VendingMachineImpl();

    }

    @Test

    public void addCurrency_Test() {
        vendingMachine.addCurrency(300);
        vendingMachine.addCurrency(200);
        int expected = 500;
        Assert.assertEquals(500, vendingMachine.getBalance());

    }

    @Test

    public void ProductRequest_Test() {

        vendingMachine.setDepositPool(20);
        int expected = 0;
        Product actual = vendingMachine.request(2);
        Assert.assertEquals("PopCorn", actual.getName());
        Assert.assertEquals(expected, vendingMachine.getDepositPool());


    }

    @Test
    public void endSession_Test() {

        vendingMachine.setDepositPool(50);
        int expected = 50;
        vendingMachine.endSession();
        Assert.assertEquals(vendingMachine.getDepositPool(), expected, 0);

    }

    @Test
    public void getDescription_Test() {
        String result = vendingMachine.getDescription(3);
        Assert.assertTrue(result.contains("50"));
        Assert.assertTrue(result.contains("SevenUp"));
        Assert.assertTrue(result.contains("big"));

    }

    @Test
    public void getBalance_Test() {

        vendingMachine.setDepositPool(200);
        int expected = 200;
        Assert.assertEquals(expected, vendingMachine.getBalance(), 0);
    }

    @Test
    public void getProduct_Test() {

        vendingMachine.getProducts();


    }

}
