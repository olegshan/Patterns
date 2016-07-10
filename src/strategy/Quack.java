package strategy;

/**
 * Created by Bors on 09.07.2016.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
