package duck;

/*
  The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
  Strategy lets the algorithm vary independently from clients that use it.
 */
public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void setFlyBehavior(FlyBehavior newFlyBehavior) {
    flyBehavior = newFlyBehavior;
  }

  public void setQuackBehavior(QuackBehavior newQuackBehavior) {
    quackBehavior = newQuackBehavior;
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
