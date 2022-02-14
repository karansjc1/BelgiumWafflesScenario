package Beverage;

public class Cola extends ColdBeverage{
    @Override
    public double cost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Coca Cola";
    }
}
