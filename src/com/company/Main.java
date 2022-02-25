package com.company;

public class Main {

    public static void main(String[] args) {
	    // java is an object oriented programming language that allows us to model
        // real lifa functionality as objects in our code.

        // Features of Java
        // java is a strictly typed language
        // Java is also a compiled language, it is turned into 'bytcode'
        // Java is a high-level language, not machine code.
        // Java is run on the JVM(Java virtual machine)
        // The JVM creates platform-independence for Java.

        // What is programming?
        // Computer programing is a process of giving a computer or IT device a series of instructions
        // that tell it the order and the process in which to carry out or execute a specific task or a set of them.

        // Concepts of programming in Java
        // variabales and datatypes
        // conditionals
        // loops
        // methods
        // classes

        // Variables and Datatypes
        // int (Integer)
        // short
        // byte
        // long
        // float // has a max of 7 decimal places
        // double // has a max of 15 decimal places
        // Strings

        // Variable: Think of it as of an empty box, where as soon as you create a box
        // you decide what type of items you can put in the box and you cannot put a different type
        // of item later on.

        // P.S. you can not have a variable with the same name in the scope in Java.

        // A variable declaration is simply giving your variable a name and data type.
        // A variable initialization is the point where you finally give that variable a value to start with.

        float number; // variable declaration
        number = 4; // variable initialization

        float value = 6; // variable declaration and initialization in one line.
//        byte byteValue = 1;

//        char charValue = 'u'; // accepts number by ASCII
//        String text = "I am going to school"; //string must be declared in Caps 'String'

//        long digits = 5L;

       // float decimalFloat = 3.683f;
       // double decimalDouble = 5.2323235353;

        //Arithmetic operators include:
        // + addition
        System.out.println("Addition of number value is:" + (number + value));
        // - subtraction
        System.out.println("Subtraction of number value is:" + (number - value));
        // / division
        System.out.println("Division of number value is:" + (number / value));
        // * multiplication
        System.out.println("Multiplication of number value is:" + (number * value));
        // % modulus ( it divides two values and returns the remainder)
        System.out.println("Modulus of number value is:" + (number % value));

        // Shortcut to  comment a line of cide: CTRL + /

//        System.out.println("Hello World!");


    }
}
