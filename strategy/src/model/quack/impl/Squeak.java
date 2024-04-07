package model.quack.impl;

import model.quack.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Пищание!");
    }

}
