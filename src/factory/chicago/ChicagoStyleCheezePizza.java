package factory.chicago;

import factory.Pizza;

/**
 * Created by Bors on 09.07.2016.
 */
public class ChicagoStyleCheezePizza extends Pizza {


    public ChicagoStyleCheezePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into square slices");
    }

}
