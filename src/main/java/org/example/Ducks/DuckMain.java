package org.example.Ducks;


public class DuckMain {

    public static void main(String[] args) {
        Duck mallardDuckOne = new MallardDucks();
        mallardDuckOne.quack("Mallard Duck One");
        mallardDuckOne.swim("Mallard Duck One");
        System.out.println(mallardDuckOne.display());

//        A new decoy duck that can't swim or quack
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.quack("Decoy Duck");
        decoyDuck.swim("Decoy Duck");
        System.out.println(decoyDuck.display());
    }

}