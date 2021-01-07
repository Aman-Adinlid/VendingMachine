package Lexicon.se.model;

public abstract class Product {


        String name;
        int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract String examine();

        public abstract void use();

        abstract Product purchase(int money);

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


