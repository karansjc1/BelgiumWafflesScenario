package Beverage;

public class Fanta extends ColdBeverage {
    @Override
    public double cost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Fanta";
    }
}
