package com.company;

public class OOPintro {

    // A class is a blueprint for describing an object
    // Car -> Attributes: color, model, numOfTires, numOfSeats.
    // Behaviour: startEngine, stopEngine, turnEngine, turnRight, turnLeft

    // fields -> used to define attributes in a method or in a class.
    public static void main(String[] args) {
        Car benz = new Car();
        benz.startEngine(false);
        benz.stopEngine();
    }
}
