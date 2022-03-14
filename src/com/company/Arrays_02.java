package com.company;


import java.util.Scanner;
import java.util.Arrays;


public class Arrays_02{
    public static void main(String[] args) {

        // An array is a collection of multiple data units of a single data type.
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for( int i=0; i< numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i =0; i< numbers.length; i++){
            sum +=numbers[i];
        }
        System.out.println("The sum of the variable is: " + sum);

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
    }



}

