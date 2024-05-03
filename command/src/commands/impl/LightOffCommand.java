package commands.impl;

import commands.Command;
import commands.parts.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
        System.out.println("Light in " + light.getLocation() + " is off...");
    }

    @Override
    public void undo() {
        light.on();
        System.out.println("Undo off light...");
    }
}
