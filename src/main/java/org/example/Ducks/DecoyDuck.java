package org.example.Ducks;

public class DecoyDuck extends Duck {
    @Override
    public String display() {
        return "I am a Decoy Duck";
    }

    @Override
    public void quack(String name) {
//        DecoyDuck cannot quack
    }

    @Override
    public void swim(String name) {
//        DecoyDuck cannot swim
    }

    @Override
    public void fly() {
//        DecoyDuck cannot fly

    }
}
