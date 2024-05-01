package product.impl;

import product.Pizza;

//Concrete product
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Deep Dish Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        addTopping("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
