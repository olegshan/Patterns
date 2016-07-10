package strategy;

/**
 * Created by Bors on 09.07.2016.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
