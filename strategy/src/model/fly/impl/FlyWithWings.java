package model.fly.impl;

import model.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }

}
