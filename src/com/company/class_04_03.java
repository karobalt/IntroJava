package com.company;

import java.sql.SQLOutput;

public class class_04_03 {
    public static void main(String[] args) {

        // continue - used to skip an iteration (one movement loop)
        // break - stop the loop immediately.
        // return - typically returns a value ( return 0 e.g)
        // void (in public static main void) means it does not return any value.
//        for (int i=2; i < 20; i++){
        // while we have equals, we also have not equals
//            if(i%2 !=0){
//                return;
//            }
        //  System.out.println(i);
//        }


        // STRINGS

        // A String is basically anything inside of double-quotes ("").
        // Strings are immutable. This means they can not be changed.
        // STrings in java are case-sensitive because it sees upperCase and lowerCase differently.
        // System.out.println("I love coding!"); // String literal.

        // Two main ways to generate strings
        // String objectString = new String("I am going home");
        // This type of String takes more space and is unideal.
        String regularString = "Physician";

        // The index of the last character in a string is less than the length of the string by 1

//         System.out.println(regularString.toUpperCase());
          System.out.println(regularString.length()); // count of the characters as string length.
//
        int counter=0;
        for(int i=0; i<regularString.length(); i++){
            if('a'== (regularString.toLowerCase().charAt(i))) {
                counter++;
            }
        }
        System.out.println("The number of times 'a' appeared is " + counter);

//        String firstWord = "Physician";
//
//        int counter = 0;
//        for (int i = 0; i < firstWord.length(); i++) {
//            System.out.println(firstWord.toLowerCase().charAt(i));
//            if ('a' == firstWord.charAt(i)) ;{
//                counter++;
//            }
//
//        }
//        System.out.println("The number of times 'a' appeared is " + counter);


    }
}
