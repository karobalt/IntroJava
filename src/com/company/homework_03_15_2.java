package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class homework_03_15_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        for (int i=0; i< vowels.length; i++)
            if (vowels[0] == 0) {
                vowels[0] = counter1;
            }
            else if (vowels[1] == 0){
                vowels[1] = counter2;
            }
            else if (vowels[2] == 0){
                vowels[2] = counter3;
            }
            else if (vowels[3] == 0){
                vowels[3] = counter4;
            }
            else if (vowels[4] == 0){
                vowels[4] = counter5;
            }
        System.out.println("The numbers of vowels in your input string, in order of A's, E's, I's, O's, U's is : ");
        System.out.println(Arrays.toString(vowels));
    }
}

