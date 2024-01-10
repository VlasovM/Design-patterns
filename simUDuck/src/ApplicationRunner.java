import model.Duck;
import model.impl.Squeak;
import model.impl.duck.MallardDuck;
import model.impl.duck.ModelDuck;

public class ApplicationRunner {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();

        model.setQuackBehavior(new Squeak());
        model.performQuack();
    }

}
