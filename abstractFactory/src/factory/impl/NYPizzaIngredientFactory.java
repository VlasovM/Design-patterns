package factory.impl;

import factory.PizzaIngredientFactory;
import product.Cheese;
import product.Clams;
import product.Dough;
import product.Pepperoni;
import product.Sauce;
import product.Veggies;
import product.impl.FreshClams;
import product.impl.Garlic;
import product.impl.MarinaraSauce;
import product.impl.Onion;
import product.impl.RedPepper;
import product.impl.ReggianoCheese;
import product.impl.SlicesPepperoni;
import product.impl.ThinCrustDough;

//Concrete factory 1
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicesPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

}
