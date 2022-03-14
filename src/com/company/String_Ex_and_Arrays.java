package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class String_Ex_and_Arrays {
    public static void main(String[] args) {


    // Scanner
    // Initialize the scanner class.
//    Scanner scanner = new Scanner(System.in);

    // Prompt the user to perform an action.
//    System.out.print("Enter you name:");
//    String userName = scanner.next(); // Accept the user input and save it to a variable.
//        String userSurname = scanner.next();
//        System.out.println();
//
//        System.out.println("your full name is: " + userName +" " + userSurname); // Return the output
//        scanner.close();

        // Write a program to compare two strings by their length and return output that
        // tells the user if the strings are equal or not.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first sentence:");
//        String firstSentence= scanner.next();
//        System.out.println("Enter second sentence:");
//        String secondSentence= scanner.next();

        //String firstSentence = "I have five plants in my house";
        //String secondSentence = "And also I have a cat";

//        if (firstSentence.length()>secondSentence.length()){
//            System.out.println("The longer string is : " + firstSentence);
//        }
//        else if (firstSentence.length()<secondSentence.length()){
//            System.out.println("The longer string is : " + secondSentence);
//        }
//        else if (firstSentence.length()==secondSentence.length()){
//            System.out.println("Both strings are the same length.");
//        }
//        else {
//            System.out.println("Can not compare strings");
//        }

        // Write a program to add as many 'r's to 'burp' by using a variable to regulate.
        // For example, if that variable is set to 4, then it will return an output like 'burrrrp'.
        // my solution

//        String letter = "r";
//        System.out.println("Input the number of character repetition");
//        String n = scanner.next();
//        String multiplied = new String(new char[n]).replace("\0", letter);
//        System.out.println("bu"+multiplied+"p");

        // Teachers solution:
//
//        String rString = ""; // this is going to contain the r's
//        System.out.println("Input the number of character repetition");
//        int rNumber = scanner.nextInt();
//        for (int i =0; i<rNumber; i++){
//            //rString = rString + "r"; // append r's to the rString, both are equal lines
//            rString += "r";
//        }
//        System.out.println("bu" + rString + "p");

        // Write a program to remove the first
        // and last letters of a string. e.g. hello becomes ell.

//        String word = "hello";
//        String wordNew = word.replace("h", "");
//        String wordNew1 = wordNew.substring(0, wordNew.length()-1);

//        System.out.println(wordNew1);

        // also another solution: substring

//        System.out.println("Input a word:");
//        String word = scanner.next();
//        String shortWord = word.substring(1, word.length()-1);
//        System.out.println(shortWord);

        // Write a program to reverse a string
        // and capitalize all the letters. e.g. hello becomes OLLEH.

//        String reversed = "";
//        System.out.println("Input a word:");
//        String word1 = scanner.next();

//        for(int i=word1.length()-1; i>=0; i--){
//            // System.out.println(word.toUpperCase().charAt(i));
//            reversed = reversed + word1.toUpperCase().charAt(i);
//            //adding values to a empty string, not just rewritting its value
//        }
//        System.out.println(reversed);

        // Escape character are special characters that allow uus to perform
        // specials from within a string.

        // \n - new line
        // \t creates a new tab
        // \r carriage turn (does the same thing as pressing 'enter'


       // System.out.println("The little \"brown\" dog ");


//        System.out.println("This is one line\tThis is second line");
//        System.out.println("This is one line\rThis is second line");

        // Wrapper Classes
        // parsing string in to an int value
//        String five= "5";
//        int number = Integer.parseInt(five);
//        System.out.println((number + number) * number);
//
//        String six = "6.00001";
//        double sixValue = Double.parseDouble(six);
//
//        String falseString = "false";
//        boolean falseValue = Boolean.parseBoolean(falseString);
//        System.out.println(falseValue);

        // Regex
        // Quantifiers are a construct under regex that allows us to
        // take note of the number of occurances of a particular sequence a string

       // aaabbbe
      //  + - checks if a character or a sequence has at least one occurance
      // in a string. e.g. a+bc -> checks if there is at least one a in the string tested.
      // * - checks if a character appears zero or more times.
      // ? - checks ir a character appears zero or one time.
//
//      Pattern pattern = Pattern.compile("[a-zA-Z0-9]?"); // Patter to check,
//        // + is for each character, without plus, looks only at one.
//      Matcher matcher = pattern.matcher("boogieboy109"); // String to check
//
//        System.out.println(matcher.matches()); // this returns true if match and false if not.

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a word:");
//       // String word = scanner.next(); // for a single word
//        String word = scanner.nextLine(); // for a sentence
//
//        // initialize a counter variable to count the vowel occurances.
//        int count = 0;
//        for (int i=0; i<word.length(); i++){
//            char currentLetter = word.toLowerCase().charAt(i);
//        switch(currentLetter) {
//            case 'a':
//                count++;
//                break;
//            case 'e':
//                count++;
//                break;
//            case 'i':
//                count++;
//                break;
//            case 'u':
//                count++;
//                break;
//            case 'y':
//                count++;
//                break;
//            case 'o':
//                count++;
//                break;
//            default:
//                //System.out.println("Not a vowel");
//                break;
//
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'u':
//            case 'y':
//            case 'o':
//                count++;
//                break;
//            default:
//                //System.out.println("Not a vowel");
//                break;
//        }
//
//        }

//        System.out.println("A number of vowels in a given word is: " + count);

        System.out.println("Input a first number:");
        String firstNo = scanner.nextLine();
        System.out.println("Input a second number:");
        String secondNo = scanner.nextLine();
        System.out.println("Input a mathematical operator:");
        char operator = scanner.next().charAt(0);
        float no1 = Float.parseFloat(firstNo);
        float no2 = Float.parseFloat(secondNo);

        //char operator = '*';
        //int bigNumber = 15;
        //float smallNumber = 3;

        switch (operator) {
            case '+':
                System.out.println("The sum is " + (no1 + no2));
                break;
            case '-':
            System.out.println("The difference is " + (no1 - no2));
            break;
            case '*':
            System.out.println("The product is " + (no1 * no2));
            break;
            case '/':
            System.out.println("The qoutient is " + (no1 / no2));
            break;
            default:
            System.out.println("Operator not recognized!");
            break;
        }
    }

}


//        int counter = 0;
//        for (int i =0; i<word.length(); i++){
//            if ('a' == word.toLowerCase().charAt(i) || 'e' == word.toLowerCase().charAt(i) || 'i' == word.toLowerCase().charAt(i)
//                    || 'y' == word.toLowerCase().charAt(i) || 'u' == word.toLowerCase().charAt(i) || 'o' == word.toLowerCase().charAt(i)){
//                counter++;
//            }
//
//        }
//        System.out.println("A number of vowels in a given word is: " + counter);

//        System.out.println("Input a first number:");
//        String firstNo = scanner.next();
//        float no1 = Float.parseFloat(firstNo);
//        System.out.println("Input a second number:");
//        String secondNo = scanner.next();
//        float no2 = Float.parseFloat(secondNo);
//        System.out.println("Input a third number:");
//        String thirdNo = scanner.next();
//        float no3 = Float.parseFloat(thirdNo);
//        System.out.println("Input a fourth number:");
//        String fourthNo = scanner.next();
//        float no4 = Float.parseFloat(fourthNo);
//        System.out.println("Input a fifth number:");
//        String fifthNo = scanner.next();
//        float no5 = Float.parseFloat(fifthNo);
//        System.out.println("Addition of first two numbers: " + (no1+no2));
//        System.out.println("Subtraction of second two numbers: " + (no3-no4));
//        System.out.println("Multiplication of first two results: " + (no1+no2) * (no3-no4));
//        System.out.println("Division of the third result by the fifth number: " + ((no1+no2) * (no3-no4))/ no5);








