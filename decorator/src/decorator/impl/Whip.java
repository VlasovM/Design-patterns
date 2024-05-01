package decorator.impl;

import component.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        setBeverage(beverage);
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Whip";
    }

}
