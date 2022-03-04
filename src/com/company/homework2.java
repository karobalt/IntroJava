package com.company;
// calculator homework
public class homework2 {
    public static void main(String[] args) {
        char operator = '*';
        int bigNumber = 15;
        float smallNumber = 3;

        if (operator == '+') {
            System.out.println("The sum is " + (bigNumber + smallNumber));
        } else if (operator == '-') {
            System.out.println("The difference is " + (bigNumber - smallNumber));
        } else if (operator == '*') {
            System.out.println("The product is " + (bigNumber * smallNumber));
        } else if (operator == '/') {
            System.out.println("The qoutient is " + (bigNumber / smallNumber));
        } else {
            System.out.println("Operator not recognized!");
        }
    }

    }

