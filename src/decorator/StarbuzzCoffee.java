package decorator;

/**
 * Created by Bors on 09.07.2016.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);

        // or
        // Beverage beverage = new Mocha(new Soy(new HouseBlend()));

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}
