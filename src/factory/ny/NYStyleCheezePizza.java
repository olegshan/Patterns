package factory.ny;

import factory.Pizza;

/**
 * Created by Bors on 09.07.2016.
 */
public class NYStyleCheezePizza extends Pizza {


    public NYStyleCheezePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}
