package factory;

import product.Cheese;
import product.Clams;
import product.Dough;
import product.Pepperoni;
import product.Sauce;
import product.Veggies;

//Abstract factory
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();

}
