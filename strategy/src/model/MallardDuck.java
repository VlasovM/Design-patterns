package model;

import model.fly.impl.FlyWithWings;
import model.quack.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck!");
    }


}
