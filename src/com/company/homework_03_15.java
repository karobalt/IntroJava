package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class homework_03_15 {
    public static void main(String[] args) {

        // Task 1:
        // Write a program that receives some numbers based
        // on the user’s choice and then returns the
        // largest number of the ones the user entered.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of integers you want to use :");
        int amount = scanner.nextInt();
        int[] numbers = new int[amount];
        for( int i=0; i< numbers.length; i++) {
            System.out.println("Enter number "+ (i+1)+":");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        String sorted = "";
        for ( int i=0; i<numbers.length; i++){
            sorted+=numbers[i]+" ";
        }
        System.out.println("Your array sorted in an ascending numerical order:" + sorted);
            System.out.println("The biggest number in your array:"+ numbers[numbers.length-1]);


            // Task 2:
            // Write a program that accepts a String from the user and returns an array
            // of integers representing the counts of each vowel in the String. The array returned
            // by your method should hold 5 elements: the first is the count of As, the second
            // is the count of Es, the third Is, the fourth Os, and the fifth Us

        System.out.println("Input a word or a phrase:");
        String userInput = scanner.nextLine();

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;

        for(int i = 0; i <=userInput.length()-1; i++) {
            char currentLetter = userInput.toLowerCase().charAt(i);

            switch (currentLetter) {
                case 'a':
                    counter1++;
                    break;
                case 'e':
                    counter2++;
                    break;
                case 'i':
                    counter3++;
                    break;
                case 'o':
                    counter4++;
                    break;
                case 'u':
                    counter5++;
                    break;
                default:
                    break;

            }
        }
        int[] vowels = new int[5];
        for (int i=0; i< vowels.length; i++) {
            if (vowels[0] == 0) {
                vowels[0] = counter1;
            } else if (vowels[1] == 0) {
                vowels[1] = counter2;
            } else if (vowels[2] == 0) {
                vowels[2] = counter3;
            } else if (vowels[3] == 0) {
                vowels[3] = counter4;
            } else if (vowels[4] == 0) {
                vowels[4] = counter5;
            }
        }
        System.out.println("The numbers of vowels in your input string, in order of A's, E's, I's, O's, U's is : ");
            System.out.println(Arrays.toString(vowels));
            }
        }
