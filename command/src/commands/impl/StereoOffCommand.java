package commands.impl;

import commands.Command;
import commands.parts.Stereo;

public class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
        stereo.deleteCD();
        stereo.setVolume(0);
        System.out.println("Stereo is off, delete the CD and set volume = 0...");
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
        System.out.println("Undo off stereo");
    }

}
