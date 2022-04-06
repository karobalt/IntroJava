package com.company;

public class OOPintro {

    // OOP ->programming paradigm
    // paradigm -> a way of viewing things.

    // Encapsulation
    // This a concept of hiding data and methods from the outside world (Classes outside
    // the one that data is defined in)
    // This allows us to control what data is given out or received.

    // A class is a blueprint for describing an object
    // Car -> Attributes: color, model, numOfTires, numOfSeats.
    // Behaviour: startEngine, stopEngine, turnEngine, turnRight, turnLeft
    // Another name for fields is a global variable.


    // fields -> used to define attributes in a method or in a class.
    public static void main(String[] args) {
//        Car benz = new Car();
//        benz.startEngine(false);
//        benz.stopEngine();
//        System.out.println();
//
//        Car bmw = new Car();
//        bmw.startEngine(true);
//        bmw.stopEngine();
//        Calculator calc = new Calculator();

        Person george = new Person("George", 28, 1.92, 86.0);
        george.setName("George");

        Person victoria = new Person("Victoria", 23, 1.76, 62.0);
        victoria.setName("Victoria");

        System.out.println("Victorias BMI is: " + victoria.personBMI());
        System.out.println("Georges BMI is: " +george.personBMI());


//        System.out.println(george.getName());
//        System.out.println(victoria.getName());
//
//        victoria.changeAge();
//        System.out.println(victoria.getAge());



//        System.out.println(Calculator.add(2,4));
//        System.out.println(calc.divide(3, 9));

        // For the person class we've written today, write  a method
        // that allows you to find the BMI of a particular person using
        // what we've learned today. Height in m, weight in kg
    }
}
