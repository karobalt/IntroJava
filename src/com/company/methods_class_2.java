package com.company;

import java.util.Scanner;

public class methods_class_2 {

    // 15 mins
    // Write a method that compares two strings ( that could be passwords) and returns true or false
    // based on their equality

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input first string to compare:");
//        String stringOne = scanner.nextLine();
//        System.out.println("Input second string to compare:");
//        String stringTwo = scanner.nextLine();
//        System.out.println(compareString(stringOne, stringTwo));
//    }
//
//    public static boolean compareString (String stringOne, String stringTwo) {
//        if (stringOne.equals(stringTwo)) return true;
//        else return false;
//    }
    // 20 mins
    // Write a method to calculate simple interest and return it.
    // Google simple interest formula.
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input principal amount:");
//        double principal = scanner.nextDouble();
//        System.out.println("Input rate of interest (in percent):");
//        double rate = scanner.nextDouble();
//        System.out.println("Input time (in years):");
//        double time = scanner.nextDouble();
//        System.out.println("Your simple interest is: "+ countInterest(principal, rate, time));
//    }

//    public static double countInterest (double no1, double no2, double no3) {
//        double result=0;
//        result = (no1*no2*no3)/100;
//        return result;
//
//    }

    // 20 mins.
    // Write a method that accepts an integer and returns whether that integer is
    // a prime number or not.
    // A prime number is a number that isn't divisible without a remainder
    // by any other numbers apart from one and itself
    // isPrime(9) -> 9 is not prime.

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a number to check:");
//        int number = scanner.nextInt();
//
//        System.out.println("Is " + number + " a prime number? -> " + checkPrime(number));
//    }
//
//    public static boolean checkPrime(int number) {
//        boolean isPrime = false;
//        int counter = 0;
//        for (int i = 2; i < number; i++) {
//
//            if (number % i == 0) {
//                counter++;
//            }
//
//        }
//        if (number == 0 || number == 1) {
//            return isPrime;
//        } else if (counter == 0) {
//            isPrime = true;
//        }
//        return isPrime;
//    }


    // Recursion
    // Recursion is a phenomenon where a method calls itself.
    // a base case is the condition under which you want a recursive operation
    // to end.

    // Factorial of a number is the multiplication of that number by all the positive
    // integers between 1 and the number.
    // The only exception being 0! -> 1
    // An example -> 5! 5x4x3x2x1 -> 120;
//    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(lengthOfString("Hello"));
//    }

//    public static int factorial (int number) {
//        int result = 1;
//        for ( int i=2; i<=number; i++)
//        {
//            result *= i; // multiply all the numbers between 1 and number n.
//        }
//        return result;
//    }
//    public static int factorial(int n)    {
//        if (n==0 || n==1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
    // 5* factorial (5-1)
    // 4* factorial (4-1)
    // 3* factorial (3-1)
    // 2* factorial (2-1)
    // 1

//    Write a method that return the length of a string
//    public static int lengthOfString(String value) {
//        if(value.equals("")){
//        return 0;
//        }
//        return lengthOfString(value.substring(1))+1;
//        }
//
    // Home tasks:
    // Using recursion, write a method that takes a number as a parameter and
    // return the total sum between one and that number;
    // upToNumber (8) -> 1+2+3+...+8

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = scanner.nextInt();

        System.out.println("Total sum between one and your entered number: " + totalSum(number));
    }

    public static int totalSum(int n) {
        if (n==0){
            return 0;
        }
        return n + totalSum(n - 1);
    }

    // Using recursion, write a method that takes a string as a parameter and
    // returns the reverse of the string.
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a string:");
//        String userInput = scanner.nextLine();
//
//        System.out.println("Your string reversed: " + reverseString(userInput));
//
//    }

    public static String reverseString(String input) {
        if (input.isEmpty()) {
            return input;
        }
        return reverseString(input.substring(1) + input.charAt(0));
    }




}



