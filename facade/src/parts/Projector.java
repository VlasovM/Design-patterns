package parts;

// Элемент подсистемы
public class Projector {

    private boolean on = false;
    private boolean off = true;

    public void on() {
        System.out.println("Turning on the projector...");
        on = true;
        off = false;
    }

    public void off() {
        System.out.println("Turning off the projector...");
        on = false;
        off = true;
    }


}
