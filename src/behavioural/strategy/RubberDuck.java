package behavioural.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
       // super(flyBehaviour, quackBehaviour);
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am rubber duck");
    }
}
