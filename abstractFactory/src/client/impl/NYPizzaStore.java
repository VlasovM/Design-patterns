package client.impl;

import product.Pizza;
import client.PizzaStore;
import factory.PizzaIngredientFactory;
import factory.impl.NYPizzaIngredientFactory;
import product.impl.CheesePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;

    }

}
