import product.Pizza;
import factory.PizzaStore;
import factory.impl.ChicagoPizzaStore;
import factory.impl.NYPizzaStore;

public class FactoryMethod {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }

}
