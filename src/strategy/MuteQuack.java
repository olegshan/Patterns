package strategy;

/**
 * Created by Bors on 09.07.2016.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<< Silence >>>");
    }
}
