package strategy;

/**
 * Created by Bors on 09.07.2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        // Mallard Duck can fly and quack, so we choose corresponding realisation
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
