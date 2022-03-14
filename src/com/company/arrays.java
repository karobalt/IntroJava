package com.company;


import java.util.Scanner;
import java.util.Arrays;


public class arrays{
    public static void main(String[] args) {

        // An array is a collection of multiple data units of a single data type.
//        int[] numbers = new int[5];
//        Scanner scanner = new Scanner(System.in);
//        for( int i=0; i< numbers.length; i++) {
//            System.out.println("Enter a number:");
//            numbers[i] = scanner.nextInt();
//        }
//
//        int sum = 0;
//        for (int i =0; i< numbers.length; i++){
//            sum +=numbers[i];
//        }
//        System.out.println("The sum of the variable is: " + sum);

        // First way to declare an array
        //int[] numbers = {4, 5, 0, 4};
       // System.out.println(numbers.length);

//        // Second way to declare an array: (you have unknown values to be added later)
//        int [] numbers1 = new int[5]; // default value for int is 0
//        String[] textArr = new String[6]; // default value for objects including String is null
//        textArr[3]= "orange";
//
//        for (int i=0; i<numbers1.length; i++){
//            System.out.println(numbers1[i]);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of integers to count the average of :");
        int amount = scanner.nextInt();
        int[] numbers = new int[amount];
        for( int i=0; i< numbers.length; i++) {
            System.out.println("Enter number "+ (i+1)+":");
            numbers[i] = scanner.nextInt();
        }

        float average = 0;
        float sum = 0;
        for (int i =0; i< numbers.length; i++){
            //System.out.println(numbers.length);
            sum +=numbers[i];
            average = sum/ numbers.length;

        }
        System.out.println("The average of the given set of numbers is: " + average);


        }



    }

