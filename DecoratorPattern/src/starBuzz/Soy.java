package starBuzz;

public class Soy extends CondimentDecorator{

  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + .50;
  }

}
