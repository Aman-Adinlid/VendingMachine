package Lexicon.se.model;

public abstract class Product {


        String name;
        int price;

        public abstract String examine();

        public abstract void use();

        abstract Lexicon.se.model.Product purchase(int money);

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }


