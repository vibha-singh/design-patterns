package behavioural.strategy;

public abstract class Duck {
    // composition
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck() {

    }
    // this will make the code tightly coupled so instead of this we can provide setter methods
//    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
//        this.flyBehaviour = flyBehaviour;
//        this.quackBehaviour = quackBehaviour;
//    }

    public void swim() {
        System.out.println("I can swim");
    }

    public abstract void display();

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
