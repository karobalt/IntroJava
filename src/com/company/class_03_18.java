package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class class_03_18 {
    public static void main(String[] args) {
        // Task 1:
        // write a java program to rearrange the following array of unique elements such that
        // each second integer is greater than the integers to it's left and right.
        // Use this Array -> {3, 5, 9,10, 7, 2, 1}
//
//        int[] numbers = {3, 5, 9, 10, 7, 2, 1};
//        int temp1 = 0;
//        int temp2 = 0;
//        for (int i=0; i<numbers.length; i++){
//            if ((i+1)%2==0) {
//            if(numbers[i]<numbers[i-1] ){
//                temp1 = numbers[i];
//                numbers[i] = numbers[i-1];
//                numbers[i-1] = temp1;
//            }
//            else if (numbers[i]<numbers[i+1]) {
//                temp2 = numbers[i];
//                numbers[i] = numbers[i+1];
//                numbers[i+1] = temp2;
//            }
//            }
//            }
//        System.out.println(Arrays.toString(numbers));

        // Task 2:
        // Write a program that allows a user to enter the base and height of a triangle and return the area
        // of a triangle interactively to the user.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the base of your triangle in cm, with 0.1 precision:");
        Float triangleBase = scanner.nextFloat();
        System.out.println("Input the height of your triangle in cm, with 0.1 precision:");
        Float triangleHeight = scanner.nextFloat();

        System.out.println("Your triangle area is: "+(0.5*triangleBase*triangleHeight) + " cm^2");

        // Task 3:
        // Write a program that accepts the a,b and c and allows to caclculate a quadratic equation based on the user input

        System.out.println("Input the first variable of your equation:");
        Float a = scanner.nextFloat();
        System.out.println("Input the second variable of your equation:");
        Float b = scanner.nextFloat();
        System.out.println("Input the third variable of your equation:");
        Float c = scanner.nextFloat();
        System.out.println("Your variables for the equation are: a="+a+", b="+b+", c="+c);
        System.out.println("The first result for the quadratic equation based on these variables is equal to :"+((-b+Math.sqrt((b*b)-(4*a*c)))/(2*a)));
        System.out.println("The second result for the quadratic equation based on these variables is equal to :"+((+b+Math.sqrt((b*b)-(4*a*c)))/(2*a)));


        }

    }

