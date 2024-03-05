package org.example.Ducks;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public static void main(String[] args) {
        System.out.println("Duck class");
    }

    public abstract String display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }
}
