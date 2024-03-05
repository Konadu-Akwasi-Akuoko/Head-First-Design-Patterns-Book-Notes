package org.example.Ducks;


public class DuckMain {

    public static void main(String[] args) {
        Duck mallardDuckOne = new MallardDucks();
        mallardDuckOne.performFly();
        mallardDuckOne.performQuack();

        mallardDuckOne.flyBehaviour = new FlyNoWay();
        mallardDuckOne.performFly();
    }

}