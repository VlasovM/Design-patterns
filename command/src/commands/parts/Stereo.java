package commands.parts;

public class Stereo {

    private boolean on = false;
    private boolean off = true;
    private int volume;
    private boolean cd = false;
    private final String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        on = true;
        off = false;
    }

    public void off() {
        off = true;
        on = false;
    }

    public void setCD() {
        cd = true;
    }

    public void deleteCD() {
        cd = false;
    }

    public void setVolume(int level) {
        volume = level;
    }

    public void undo() {

    }

}
