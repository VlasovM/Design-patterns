package model.quack.impl;

import model.quack.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Кря-кря!");
    }

}
