package Lexicon.se;

import Lexicon.se.data.VendingMachine;
import Lexicon.se.data.VendingMachineImpl;
import com.sun.corba.se.spi.orb.Operation;
import com.sun.xml.internal.ws.wsdl.writer.document.BindingOperationType;

public class App 
{
    public static void main( String[] args ){

        VendingMachine vendingMachine = new VendingMachineImpl();
        vendingMachine.addCurrency(100);

        vendingMachine.endSession();
        vendingMachine.getDescription(12);
        vendingMachine.getBalance();

        System.out.println("Welcome to my new machine");
        System.out.println("Enter a number or make a result =: ");
        System.out.println("Enter Product Type: ");
        System.out.println("print menu: ");


    }
}
