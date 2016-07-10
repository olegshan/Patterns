package factory;

import factory.chicago.ChicagoStylePizzaStore;
import factory.ny.NYStylePizzaStore;

/**
 * Created by Bors on 09.07.2016.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(" --- ");
        pizza = chicagoStore.orderPizza("cheese");

    }

}
