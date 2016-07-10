package observer;

/**
 * Created by Bors on 09.07.2016.
 */
public interface Subject {

    void registerObserver(Object o);
    void removeObserver(Object o);
    void notifyObserver();

}
