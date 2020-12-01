package starBuzz;

public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.getCost());

    Beverage beverage1 = new HouseBlend();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());

    Beverage beverage2 = new Espresso();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    beverage2 = new Soy(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());
  }

}
