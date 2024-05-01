package model;

import model.fly.impl.FlyNoWay;
import model.quack.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }

}
