package Beverage;

public class Sprite extends ColdBeverage{
    @Override
    public double cost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Sprite";
    }
}
