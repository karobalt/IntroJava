package com.company;

import java.util.Arrays;
import java.lang.Math;

public class homework_03_20 {
    public static void main(String[] args) {


        // Task 1:
        //Write a Java program to find maximum product of two integers in a given array of integers Example:
        //Input :
        //nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
        //Output:
        //Pair is (7, 8, Maximum Product: 56


        int[] numberArray = {2, 3, 5, 7, -7, 5, 8, -5};
        int product=0;
        String productElements = "";
        for(int i=0; i<numberArray.length; i++){
            for(int j=i+1; j<numberArray.length; j++) {
                product = numberArray[i] * numberArray[j];
                productElements += product+ ";";
            }
        }
        String[] stringArray = productElements.split(";");

        int [] productArray = new int [stringArray.length];
        for(int i=0; i<stringArray.length; i++){
            productArray[i]=Integer.parseInt(stringArray[i]);
        }
        Arrays.sort(numberArray);
        Arrays.sort(productArray);
        System.out.println("Pair is " + (numberArray[numberArray.length-2])+ ", "+ (numberArray[numberArray.length-1]) + ". Maximum product:" + (productArray[productArray.length-1]));

        //maxValue = Math.max(sumArray[i], sumArray[j]);

        // Task 2:
        //Write a Java program to find minimum subarray sum of specified size in a given array of integers Example:
        //Input :
        //nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
        //Output:
        //Sub-array size: 4
        //Sub-array from 0 to 3 and sum is: 10

        int[] task2Array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        String sumElements = "";
        for(int i=0; i<task2Array.length-3; i++){
            int subArray= task2Array[i]+task2Array[i+1]+task2Array[i+2]+task2Array[i+3];
            sumElements += subArray+ ";";

        }
        String[] stringtask2Array = sumElements.split(";");

        int [] sumArray = new int [stringtask2Array.length];
        for(int i=0; i<stringtask2Array.length; i++) {
            sumArray[i] = Integer.parseInt(stringtask2Array[i]);
        }
        Arrays.sort(sumArray);
        Arrays.sort(task2Array);
        System.out.println("Sub-array size: 4");
        System.out.println("Sub-array from 0 to 3. It's sum is: " + sumArray[0]);
            }


    }
