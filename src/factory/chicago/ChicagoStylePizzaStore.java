package factory.chicago;

import factory.Pizza;
import factory.PizzaStore;

/**
 * Created by Bors on 09.07.2016.
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheezePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else return null;

        return pizza;
    }
}
