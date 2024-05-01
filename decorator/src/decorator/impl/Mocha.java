package decorator.impl;

import component.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        setBeverage(beverage);
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Mocha";
    }

}
