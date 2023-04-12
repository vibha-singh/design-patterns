package behavioural.strategy;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am red headed Duck");
    }
}
