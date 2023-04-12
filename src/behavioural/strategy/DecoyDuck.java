package behavioural.strategy;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am decoy Duck");
    }
}
