package singleton;

/**
 * Created by Bors on 10.07.2016.
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    private static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {

                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
