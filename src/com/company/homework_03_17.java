package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class homework_03_17 {
    public static void main(String[] args) {

        // Task 1:
        // You're given a string of words from the user. You need to find the word "Nemo",
        // and return a string like this: "I found Nemo at [the order of the word you find Nemo]!".
        // If you can't find Nemo, return "I can't find Nemo :(".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word or a phrase:");
        String userInput = scanner.nextLine();
        String[] stringArray = userInput.toLowerCase().split(" ");
        int count=0;
        int nemoAt=0;
        for(int i=0; i<stringArray.length; i++){
            if(stringArray[i].equals("nemo")){
                nemoAt=i;
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("I found Nemo at position "+(nemoAt+1)+"!");
        }
        else {
            System.out.println("I can't find Nemo :(");
        }

        // Task 2:
        // Create a program that takes an array and returns the difference
        // between the biggest and smallest numbers.

        System.out.println("Enter a number of integers you want to use :");
        int amount = scanner.nextInt();
        int[] numbers = new int[amount];
        for( int i=0; i< numbers.length; i++) {
            System.out.println("Enter number "+ (i+1)+":");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int difference = numbers[numbers.length-1]-numbers[0];

        System.out.println("The difference between the biggest and smallest numbers is:" + difference);

        // Task 3:
        // Create a program that takes an array of Strings (You can initialize the variable
        // without user input) and checks if the last item matches the rest of the array concatenated together.
        // For example,  ["i", "love", "tesh", "ilovetesh"] will return true.

       // String[] phrase = {"I", "like", "potatoes", "Ilikepotatoes"};

        // Ternary operator is a conditional that can be used to decide execution flow on the fly
        // sout(string.equals(array[array.length -1]) ? "match" : " don't match")

        System.out.println("Input a word or a phrase:");
        String input = scanner.nextLine();
        String[] phrase = input.toLowerCase().split(" ");
        String joined = "";
        for (int i =0; i<phrase.length-1; i++) {
            joined += phrase[i];
        }
        boolean equal= false;
        if(joined.equals(phrase[phrase.length-1])) {
            equal = true;
        }
        System.out.println(equal);

    }
}

