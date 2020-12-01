package starBuzz;

public class Whip extends CondimentDecorator {
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + .70;
  }

}
