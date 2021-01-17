package Lexicon.se;

import Lexicon.se.data.VendingMachineImpl;
import Lexicon.se.model.Drink;
import Lexicon.se.model.Food;
import Lexicon.se.model.Product;
import Lexicon.se.model.Snack;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        VendingMachineImpl vendingMachine = new VendingMachineImpl();

        Product product1 = new Drink(3,"sevenUp",50,"big");
        Product product2 = new Food(1,"Potato",20,100);
        Product product3 = new Snack(2,"popCorn",10,5);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        while (true) {
            System.out.println("############################################");
            System.out.println("Welcome to my vending machine");
            System.out.println("1. addCurrency");
            System.out.println("2. getBalance");
            System.out.println("3. getProduct");
            System.out.println("4. getDescription");
            System.out.println("5. buy the product");
            System.out.println("6. endSession");

            Scanner sc = new Scanner(System.in);
            System.out.println(" enter a valid operation number: ");
            String operationType = sc.nextLine();

            switch (operationType) {

                case "1":
                    System.out.println("enter amount to depositPool");
                    int amount = sc.nextInt();
                    vendingMachine.addCurrency(amount);
                    break;
                case "2":
                    System.out.println("get balance");
                    System.out.println("vendingMachine.getBalance()+ kr");
                    break;
                case "3":


            }


            }
    }
}