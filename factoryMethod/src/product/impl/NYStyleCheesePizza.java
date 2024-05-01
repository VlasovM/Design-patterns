package product.impl;

import product.Pizza;

// Concrete product
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        setName("NY style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        addTopping("Grated Reggiano Cheese");
    }

}
