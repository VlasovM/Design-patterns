package store.impl;

import product.Pizza;
import product.impl.NYStyleCheesePizza;
import product.impl.NYStylePepperoniPizza;
import store.PizzaStore;

//Concrete creator
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("sausages")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }

}
