package store.impl;

import product.Pizza;
import product.impl.ChicagoStyleCheesePizza;
import store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }

}
