package org.example.Ducks;

public class MallardDucks extends Duck implements FlyBehaviour, QuackBehaviour, SwimBehaviour {
    @Override
    public String display() {
        return "I am a Mallard Duck";
    }

    @Override
    public void quack(String name) {
        System.out.println("The " + name + " is quacking");

    }

    @Override
    public void swim(String name) {
        System.out.println("The " + name + " is swimming");

    }

    @Override
    public void fly() {
        System.out.println("I'm flying with wings!!");
    }
}
