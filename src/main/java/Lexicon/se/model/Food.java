package Lexicon.se.model;

public class Food extends Product{

  private int calories;

    public int getCalories() {
        return calories;

    }
    public void setCalories(int calories) {
        this.calories = calories;
    }


    public Food(int productNumber, String name, int price, int calories) {
        super(productNumber, name, price);
        this.calories = calories;
    }

    @Override
    public String examine() {
        return getName() + " " + getCalories() + " " + getPrice();

    }

    @Override
    public void use() {
        System.out.println("Do you need more?" + super.getName());

    }

    }
