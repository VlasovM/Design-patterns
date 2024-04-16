import component.Beverage;
import component.impl.Espresso;
import decorator.impl.Mocha;
import decorator.impl.Whip;

public class Decorator {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": " + beverage.cost() + " $");

        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + ": " + beverage.cost() + " $");
    }

}
