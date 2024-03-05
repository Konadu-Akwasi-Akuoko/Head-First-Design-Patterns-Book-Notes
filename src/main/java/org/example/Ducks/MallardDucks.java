package org.example.Ducks;

public class MallardDucks extends Duck {

    public MallardDucks() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public String display() {
        return "I am a Mallard Duck";
    }


}
