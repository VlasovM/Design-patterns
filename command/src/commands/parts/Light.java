package commands.parts;

public class Light {

    private boolean on = false;
    private boolean off = true;
    private final String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        on = true;
        off = false;
    }

    public void off() {
        on = false;
        off = true;
    }

    public String getLocation() {
        return location;
    }
}
