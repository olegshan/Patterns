package factory.ny;

import factory.Pizza;
import factory.PizzaStore;

/**
 * Created by Bors on 09.07.2016.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheezePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
