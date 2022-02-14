package Waffle.WaffleDecorator;

import Waffle.Waffle;

public class DarkChocolate extends ChocolateDecorator{
    Waffle waffle;

    public DarkChocolate(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 60 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Chocolate";
    }
}
