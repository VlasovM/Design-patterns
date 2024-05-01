import product.Pizza;
import client.PizzaStore;
import client.impl.NYPizzaStore;

public class AbstractFactory {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }

}
