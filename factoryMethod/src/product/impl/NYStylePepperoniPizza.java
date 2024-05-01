package product.impl;

import product.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        setName("NY Style pepperoni pizza");
        setDough("Thin Crust Dough");
        setSauce("Pepperoni's sauce");

        addTopping("Sausages");
    }

}
