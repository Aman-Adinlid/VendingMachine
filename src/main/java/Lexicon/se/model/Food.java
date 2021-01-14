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
        String Information = getProductNumber()+ "  " + getName() + " " + getCalories() + " " + getPrice();
        return Information;
    }

    @Override
    public String use() {
      String consume = "Do you need more?";
      return consume;
    }

    @Override
    public int getProductNumber() {
        return super.getProductNumber();
    }
}
