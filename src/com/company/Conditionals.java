package com.company;

import java.sql.SQLOutput;

public class Conditionals {
    public static void main(String[] args) {
        // Conditionals is simply a way of telling the computer to perform certain actions based on certain conditions.
//        int number = 3;
//        if (number==2) {
//            System.out.println("The value is 2");}
//        else {
//            System.out.println("The value is not 2");
//        }

//        int number = 8;
//        if (number>9) {
//            System.out.println("The number " + number + " is greater than 9");}
//        else {
//            System.out.println("Did not satisfy the task");
//        }
//        int number1 = 9;
//        if (number1>9) {
//            System.out.println("The number " + number1 + " is greater than 9");}
//        else {
//            System.out.println("Did not satisfy the task");
//        }
//        int number2 = 10;
//        if (number2>9) {
//            System.out.println("The number " + number2 + " is greater than 9");}
//        else {
//            System.out.println("Did not satisfy the task");
//        }
//
//        int number3 = 11;
//        if (number3>9) {
//            System.out.println("The number " + number3 + " is greater than 9");}
//        else {
//            System.out.println("Did not satisfy the task");
//        }
//
//        int number4 = 12;
//        if (number4>9) {
//            System.out.println("The number " + number4 + " is greater than 9");}
//        else {
//            System.out.println("Did not satisfy the task");
//        }
//        int number5 = 13;
//        if (number5>9) {
//            System.out.println("The number " + number5 + " is greater than 9");}
//        else {
//            System.out.println("Did not satisfy the task");
//        }
//        int number6 = 14;
//        if (number6>9) {
//            System.out.println("The number " + number6 + " is greater than 9");}
//        else {
//            System.out.println("Did not satisfy the task");
//        }
//    }

//        int value = 11;
//        if (value == 11) {
//            System.out.println(value + " is eleven");
//        } else if (value > 9 && value < 15) {
//            System.out.println(value + " is greater than 9");
//        } else if (value<9){
//            System.out.println(value + " is not greater than 9");
//        } else {
//            System.out.println(value + "value is out of bounds");

//        }

        // Loops are construct that allows us to repeat a set of commands
        // until a condition to terminate ir reached.
        // Do-While loop is basically saying do this for as long as the condition is true.
//        int i = 0;
//        do {
//            System.out.println(i); // print out the count
//            i=i+1; // increase the count  by 1
//        } while (i<10);

        // while loop is basically saying do this
        // PRO-TIP: user while loop when you don't have and idea of how many
        // times the loop is supposed to run.
//        while (i<11) {
//            System.out.println(i);
//            i=i+1;
//        }

        // For loop
        // Use the for loop typically when you have an idea of how many times
        // the loop is supposed to run.
//        for (int i = 0; i< 15; i++) {
//            if (i > 9){
//                System.out.println(i+" is greater than 9");
//            }

//        for (int i=1; i<51; i++) {
//            if( i%2==0) {
//                System.out.println(i +" is even");
//            }
//            else {
//                System.out.println(i+ " is odd");
//            }
//        }
//        int i=1;
//        while (i<51) {
//            if( i%4==0) {
//                System.out.println(i +" is a multiple of 4");
//            }
//            i=i+1;
//        }


        // Unary operators:
        // Addition
        // pre-incrementation operators ++i
        // post-incrementation operators i++
        // Subtraction
        // pre-incrementation operators --i
        // post-incrementation operators i--

        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0  && i % 7 ==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0 ) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

//Java conventions ragrding naming.
// You can't use keywords as names, e.g. you cant use 'int', 'boolean' and so on.
// Variables & method - incrementOne, birdSound, numberOfWings.
// class - IncrementOne, BirdSound, NumberOfWings.