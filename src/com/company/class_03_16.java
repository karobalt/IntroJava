package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class class_03_16 {

  //  public static void main(String[] args) {

        // Task 1
        //  Ask a user to enter a range of numbers and sort that group of numbers in such a way that even numbers
        // come first in the output and odd numbers are after the even numbers.
        // The sorted version is [2,4,8,10,5,9,7,3]

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number of integers you want to use :");
//        int amount = scanner.nextInt();
//        int[] numbers = new int[amount];
//        for( int i=0; i< numbers.length; i++) {
//            System.out.println("Enter number "+ (i+1)+":");
//            numbers[i] = scanner.nextInt();
//            // separate the odd and even numbers
//            int counter = 0;
//            int temp=0;
//            while (counter< numbers.length && numbers[counter]%2!=0) counter++;
//            for( i=counter +1; i< numbers.length; i++){
//            if(numbers[i]%2==0){
//                temp= numbers[counter];
//                numbers[counter]=numbers[i];
//                numbers[i]=temp;
//                counter++;
//
//            }
//            }
//        }
//            if ((numbers[i])%2==0) evenCount++;
//            else oddCount++;
////        }
//        int[] evenNumbers = new int[evenCount];
//        int[] oddNumbers = new int[oddCount];
//        // filter them into their respective arrays.
//        for (int i = 0; i<numbers.length; i++){
//           for(int j=0; j <numbers.length; j++){
//               if(numbers[i]%2==0){
//
//               }
//           }
//            }
//        }
//        System.out.println(Arrays.toString(evenNumbers));
//        System.out.println(Arrays.toString(oddNumbers));

        // task 2:
        // Write a program to return the second largest number from a stream of inputted integers
        // from the user.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number of integers you want to use :");
//        int amount = scanner.nextInt();
//        int[] numbers = new int[amount];
//        for( int i=0; i< numbers.length; i++) {
//            System.out.println("Enter number " + (i + 1) + ":");
//            numbers[i] = scanner.nextInt();
//        }
//
//            int emptyValue=0;
//            for (int i=0; i<numbers.length; i++) {
//                for (int j = i + 1; j < numbers.length; j++) {
//                    if (numbers[i] > numbers[j]) {
//                        emptyValue = numbers[i];
//                        numbers[i] = numbers[j];
//                        numbers[j] = emptyValue;
//                    }
//                }
//            }
//            System.out.println("Your array sorted: "+ Arrays.toString(numbers));
//        System.out.println("Second largest number in array is: "+ numbers[numbers.length-2]);


        // Task 3:
        // write a program to find out if in a list of
        // numbers entered by a user is a multiple of 3
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number of integers you want to use :");
//        int amount = scanner.nextInt();
//        int[] numbers = new int[amount];
//        for( int i=0; i< numbers.length; i++) {
//            System.out.println("Enter number " + (i + 1) + ":");
//            numbers[i] = scanner.nextInt();
//        }
//        System.out.println("Your input number are: "+ Arrays.toString(numbers));
//        int count=0;
//        for(int i=0; i<numbers.length; i++) {
//            if (numbers[i] % 3 == 0) {
//                count++;
//            }
//        }
//                if(count>0) {
//                    System.out.println("Your input numbers do contain at least one multiple of 3");
//            }
//            else{
//                System.out.println("Your input numbers do not contain any multiples of 3");
//
//            }
 //   }
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a first number (should be smaller than the second one):");
            String smallNumber = scanner.nextLine();
            System.out.println("Input a second number (bigger):");
            String bigNumber = scanner.nextLine();
            System.out.println("Input a mathematical operator:");
            char operator = scanner.next().charAt(0);
            float no1 = Float.parseFloat(smallNumber);
            float no2 = Float.parseFloat(bigNumber);

            System.out.println();

        }


}



