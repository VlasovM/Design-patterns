package commands.impl;

import commands.Command;
import commands.parts.Stereo;

public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
        System.out.println("Stereo is on, set the CD and set volume = 11...");
    }

    @Override
    public void undo() {
        stereo.off();
        stereo.setVolume(0);
        stereo.deleteCD();
        System.out.println("Undo on stereo");
    }

}
