package behavioural.strategy;

public class MallardDuck extends Duck{
    public MallardDuck() {
       // super(flyBehaviour, quackBehaviour);
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am mallard Duck");
    }
}
