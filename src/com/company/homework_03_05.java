package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Locale;

public class homework_03_05 {
    public static void main(String[] args) {

        // Write a program to compare two strings by their length and return output that
        // tells the user if the strings are equal or not.

        String firstSentence = "I have five plants in my house";
        String secondSentence = "And also I have a cat";

        if (firstSentence.length()>secondSentence.length()){
            System.out.println("The longer string is : " + firstSentence);
        }
        else if (firstSentence.length()<secondSentence.length()){
            System.out.println("The longer string is : " + secondSentence);
        }
        else if (firstSentence.length()==secondSentence.length()){
            System.out.println("Both strings are the same length.");
        }
        else {
            System.out.println("Can not compare strings");
        }

        // Write a program to add as many 'r's to 'burp' by using a variable to regulate.
        // For example, if that variable is set to 4, then it will return an output like 'burrrrp'.

        String letter = "r";
        int n = 7;
        String multiplied = new String(new char[n]).replace("\0", letter);
        System.out.println("bu"+multiplied+"p");

        // Write a program to remove the first
        // and last letters of a string. e.g. hello becomes ell.

        String word = "hello";
        String wordNew = word.replace("h", "");
        String wordNew1 = wordNew.substring(0, wordNew.length()-1);

        System.out.println(wordNew1);

        // Write a program to reverse a string
        // and capitalize all the letters. e.g. hello becomes OLLEH.

        String reversed = "";

        for(int i=word.length()-1; i>=0; i--){
           // System.out.println(word.toUpperCase().charAt(i));
            reversed = reversed + word.toUpperCase().charAt(i);
        }
            System.out.println(reversed);



        }




    }
