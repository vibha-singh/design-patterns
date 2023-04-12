package behavioural.strategy;

public class MuteQuack implements QuackBehaviour{

    public void quack() {
        System.out.println("I can quack without sound");
    }
}
