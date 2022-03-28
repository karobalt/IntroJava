package com.company;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class class_03_25 {
    public static void main(String[] args) {


        // Task 1: Arrays
        // Write a program that takes in the weight and height of 5 people from the user and returns
        // the average BMI of the group

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the weight and height of 5 people");
//        int[] weight = new int[5];
//        float[] height = new float[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter persons " + (i + 1) + " weight in kilograms:");
//            weight[i] = scanner.nextInt();
//            System.out.println("Enter persons " + (i + 1) + " height in meters:");
//            height[i] = scanner.nextFloat();
//        }
//        float[] BMI = new float[5];
//        for (int i = 0; i < 5; i++) {
//            BMI[i] = weight[i] / (float) Math.pow(height[i], 2);
//
//        }
//        double average = (BMI[0] + BMI[1] + BMI[2] + BMI[3] + BMI[4]) / 5;
//        System.out.println("The average BMI of the group is: " + average);


        // Task 2:
        // Given a  string from the user return the letter and count of the character that occurs the most
        // in the string.

//        System.out.println("Input a word or a phrase:");
//        String userInput = scanner.nextLine();
//        String charCount = "";
//
//        int[] counter = new int[userInput.length()-1];
//        for(int i = 0; i<userInput.length(); i++){
//            counter[i]=1;
//        }
//        System.out.println(userInput.length());
//        for (int i = 0; i < userInput.length() ; i++) {
//            for(int j=i+1; j <userInput.length(); j++) {
//                if(userInput.toLowerCase().charAt(i)==userInput.toLowerCase().charAt(j)) {
//                   charCount += counter[i]++;
//                }
//
//            }
//            }
//        System.out.println(userInput.charAt(3));
//        System.out.println(charCount);


            // Task 3:
            // You are sent to the grocery store with the following items on your list ["Bananas", "Bread", "Fish"]
            // The cost of the items in the store is [12, 5, 10]. Your current cash-in-hand is 20 dollars.
            // Which of the items can you safely buy without needing extra cash.
            // Priority - Bananas[least], Fish[second], Bread[first].

        String [] groceryList = {"Bananas", "Bread", "Fish"};
        int[] prices = {12,5,10};
        int totalCost = prices[2]+prices[1];
        System.out.println("You can buy Fish and Bread and you'll be left with"+(20-totalCost));

            // Dates
        //Receive the year, month and day from the user separately.
        // The year should be a four-digit number.
        // Assume that the date is correct
        // Determine if the date is a magic date
        // A magic date occurs when:
        // m*d is a one-digit number that matches the last digit of the year. OR
        // m*d is a two-digit number that matches the last two digits of the year. OR
        // m*d is a three-digit number that matches the last three digits of the year.
        // return the output interactively to the user.

        System.out.println("Enter a date of your choice, to check if it is a magic date");
        System.out.println("Enter the year of the date (none less than 4 digits):");
        String userYear = scanner.nextLine();
        System.out.println("Enter the month of the date:");
        String userMonth = scanner.nextLine();
        System.out.println("Enter the day of the date:");
        String userDay = scanner.nextLine();
        String magic1 = userYear.substring(3);
        String magic2 = userYear.substring(2);
        String magic3 = userYear.substring(1);
        int year1 = Integer.parseInt(magic1);
        int year2 = Integer.parseInt(magic2);
        int year3 = Integer.parseInt(magic3);
        int month = Integer.parseInt(userMonth);
        int day = Integer.parseInt(userDay);

        if( month*day == year1 || month*day == year2 || month*day== year3){
            System.out.println("Your entered date is a magic date.");
        }
        else {
            System.out.println("Your entered date is not a magic date.");
        }



        }
    }


