package duck;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck duck = new MallardDuck();
    duck.performFly();
    duck.performQuack();

    Duck duck1 = new ModelDuck();
    duck1.performFly();
    duck1.setFlyBehavior(new FlyRocketPowered());
    duck1.performFly();
  }
}
