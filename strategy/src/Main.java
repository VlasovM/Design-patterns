import model.Duck;
import model.MallardDuck;
import model.ModelDuck;
import model.fly.impl.FlyNoWay;
import model.quack.impl.Squeak;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        mallardDuck.setQuackBehavior(new Squeak());     // Возможность взаимозаменять алгоритмы
        mallardDuck.setFlyBehavior(new FlyNoWay());

        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
    }

}
