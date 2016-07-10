package strategy;

/**
 * Created by Bors on 09.07.2016.
 */
public class DuckSimulator {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        duck.display();
        duck.fly();
        duck.quack();

        duck = new ModelDuck();
        duck.display();
        duck.fly();
        duck.quack();
        duck.setFlyBehavior(new FlyWithWings());
        duck.fly();
    }

}
