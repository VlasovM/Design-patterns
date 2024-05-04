public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    private void boilWater() {
        System.out.println("The water is boiling...");
    }

    private void pourInCup() {
        System.out.println("Pouring in cup");
    }

}
