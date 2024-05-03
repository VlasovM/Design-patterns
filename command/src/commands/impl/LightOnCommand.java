package commands.impl;

import commands.Command;
import commands.parts.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        System.out.println("Light in " + light.getLocation() + " is on...");
    }

    @Override
    public void undo() {
        light.off();
        System.out.println("Undo on light...");
    }

}
