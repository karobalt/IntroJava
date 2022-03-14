package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class homework_03_09 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a word or a sentence:");
//        String inputWord = scanner.nextLine();
//
//        // Task1: biskuti dar kreivas.
//
//        int countCase=0;
//        String foundChar = "";
//        for (int i=0; i<inputWord.length(); i++) {
//            char currentLetter = inputWord.toLowerCase().charAt(i);
//
//            switch (currentLetter) {
//                case 'u':
//                    //System.out.println("It\'s true! Your string contains letter u.");
//                    //break;
//                case 'w':
//                    //System.out.println("It\'s true! Your string contains letter w.");
//                    //break;
//                case '6':
//                    //System.out.println("It\'s true! Your string contains number 6.");
//                    //break;
//                case 'i':
//                    //System.out.println("It\'s true! Your string contains letter i.");
//                    //break;
//                case 'b':
//                    //System.out.println("It\'s true! Your string contains letter b.");
//                    //break;
//                case 'q':
//                    countCase++;
//                    foundChar = foundChar+currentLetter;
//                    break;
//                default:
//                    break;
//            }
//
//
//            }
//
//        if (countCase>0){
//
//            System.out.println("It\'s true! Your string contains character: "+foundChar.substring(0,1));
//        }
//        else {
//            System.out.println("It\'s false! Your string does not contain any special letters.");
//        }

        // Task 2:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a word or a sentence:");
//        String inputWord = scanner.nextLine();
//        String reversed = "";
//
//        for(int i = inputWord.length()-1; i>=0; i--){
//            reversed += inputWord.charAt(i);
//
//        }
//        System.out.println("Your reversed string is: "+ reversed);
//
//        if (reversed.equalsIgnoreCase(inputWord))
//        {
//            System.out.println("Your reversed string "+reversed+" is the same as your input string "+inputWord);
//        }
//        else {
//            System.out.println("Your reversed string "+reversed+" is not the same as your input string "+inputWord);
//        }

        // Task 3:

        // Write a program that accepts any of the primary colors as a String and
        // returns the complimentary color of that color to the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a primary color:");
        String inputColor = scanner.nextLine();

        switch (inputColor.toLowerCase()){
            case "red":
                System.out.println("The complimentary colour of red is cyan");
                break;
            case "blue":
                System.out.println("The complimentary colour of blue is yellow");
                break;
            case "green":
                System.out.println("The complimentary colour of green is magenta");
                break;
            default:
                System.out.println("Your input is not a primary colour!");
                break;
        }




    }



    }
