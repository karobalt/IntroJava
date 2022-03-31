package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsIntro {

    // public - accessible throughout the project
    // class - a blueprint for describing an object
    //public static void main(String[] args) {
    //  boolean evenValue = checkEven(6);
    //    System.out.println(checkEven(numberToCheck));
    //}
    // methods - is a vehicle or errand boy that you pass a series of instructions to
    // and it will return the output or results to you.

//    public static boolean checkEven (int number){
//        if (number % 2 ==0) return true;
//        else return false;
//
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a word or a phrase:");
//        String userInput = scanner.nextLine();
//        System.out.println("The number of consonants in your string is: "+ consonantCount(userInput));
//    }

//    public static int consonantCount (String input){
//        int count=0;
//        for(int i=0; i<input.length(); i++)
//        if( input.toLowerCase().charAt(i)!='a' && input.toLowerCase().charAt(i)!='e'
//                && input.toLowerCase().charAt(i)!='u' && input.toLowerCase().charAt(i)!='i'
//                && input.toLowerCase().charAt(i)!='y' && input.toLowerCase().charAt(i)!='o'
//                && input.toLowerCase().charAt(i)!=' '){
//            count++;
//        }
//        return count;
//    }

    // 15 mins.
    // Write a method that takes in a string and return the number of consonants in the string.
    //Input should be from the user.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number of integers you want to use :");
//        int amount = scanner.nextInt();
//        int[] numbers = new int[amount];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter number " + (i + 1) + ":");
//            numbers[i] = scanner.nextInt();
//
//        }
//        System.out.println("All your entered number are: " + Arrays.toString(numbers));
//        System.out.println("The maximum number of your entered numbers is: " + maxNumber(numbers));
//    }

//        public static int maxNumber (int [] numbersArray ) {
//        int temp1 = 0;
//        for (int i = 0; i < numbersArray.length; i++) {
//            for (int j = i + 1; j < numbersArray.length; j++) {
//                if (numbersArray[i] > numbersArray[j]) {
//                    temp1 = numbersArray[i];
//                    numbersArray[i] = numbersArray[j];
//                    numbersArray[j] = temp1;
//                }
//            }
//        }
//        return numbersArray[numbersArray.length-1];
//
//
//}
// Write a method that accepts three parameters, double smallNumber, double bigNumber, String operator
    //Based on the arithmetic operator passed, perform one of the following operations: +, -, *, /
    // on the small and big number and return the result. The return should be a double.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number (should be bigger than the second one):");
        String bigNumber = scanner.nextLine();
        System.out.println("Input second number (smaller):");
        String smallNumber = scanner.nextLine();
        System.out.println("Input a mathematical operator:");
        char operator = scanner.next().charAt(0);
        float no1 = Float.parseFloat(bigNumber);
        float no2 = Float.parseFloat(smallNumber);
        System.out.println("Your result is:"+ performOperation(no1, no2, operator));

    }

    public static double performOperation (double no1, double no2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                return no1 + no2;
            case '-':
                return no1 - no2;
            case '*':
                return no1 * no2;
            case '/':
                return no1 / no2;
            default:
                System.out.println(operator+"operator is not valid");
                return 0;
        }
    }



    }