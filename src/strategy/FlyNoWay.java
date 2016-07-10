package strategy;

/**
 * Created by Bors on 09.07.2016.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
