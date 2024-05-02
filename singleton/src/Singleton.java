public class Singleton {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        System.out.println("Object is: " + chocolateBoiler.toString());

        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        chocolateBoiler = ChocolateBoiler.getInstance();

        System.out.println("Object is: " + chocolateBoiler.toString());
    }

}
