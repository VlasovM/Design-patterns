public class ChocolateBoiler {

    public volatile static ChocolateBoiler uniqueBoiler;

    private boolean empty = true;
    private boolean boiled = false;

    private ChocolateBoiler() {
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueBoiler == null) {
                    uniqueBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("Fill boiler milk with chocolate...");
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Draining milk and chocolate...");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("Boiling...");
            boiled = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
