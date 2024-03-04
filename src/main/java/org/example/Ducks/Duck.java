package org.example.Ducks;

public abstract class Duck implements DuckBehaviour {

    public static void main(String[] args) {
        System.out.println("Duck class");
    }

//    public void quack(String name) {
//        System.out.println("The " + name + " is quacking");
//    }
//
//    public void swim(String name) {
//        System.out.println("The " + name + " is swimming");
//    }

    public abstract String display();
}
