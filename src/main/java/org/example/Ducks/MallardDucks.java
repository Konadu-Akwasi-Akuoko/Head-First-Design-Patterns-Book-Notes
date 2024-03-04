package org.example.Ducks;

public class MallardDucks extends Duck {
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
}
