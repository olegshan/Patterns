package decorator;

/**
 * Created by Bors on 09.07.2016.
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
