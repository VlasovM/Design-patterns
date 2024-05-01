package decorator;

import component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    @Override
    public abstract String getDescription();

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

}
