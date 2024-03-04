package org.example.Ducks;

public abstract class Duck implements QuackBehaviour, FlyBehaviour, SwimBehaviour {

    public static void main(String[] args) {
        System.out.println("Duck class");
    }

    public abstract String display();
}
