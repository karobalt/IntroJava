package com.company;

public class Vowel_in_word {
    public static void main(String[] args) {

        String firstWord = "Physician";

        int counter = 0;
        for (int i=0; i<firstWord.length(); i++) {
            if ('a' == firstWord.toLowerCase().charAt(i) || 'i' == firstWord.toLowerCase().charAt(i) || 'y' == firstWord.toLowerCase().charAt(i)) {
                counter++;
            }
        }
        System.out.println("The number of times a vowel appeared in a word " +firstWord+ " is " + counter);

        String secondWord = "Aerodynamics";

        int counter1 = 0;
        for (int x=0; x<secondWord.length(); x++) {
            if ('a' == secondWord.toLowerCase().charAt(x) || 'i' == secondWord.toLowerCase().charAt(x) || 'y' == secondWord.toLowerCase().charAt(x)
                    || 'e' == secondWord.toLowerCase().charAt(x)|| 'o' == secondWord.toLowerCase().charAt(x)) {
                counter1++;
            }
        }
        System.out.println("The number of times a vowel appeared in a word " +secondWord+ " is " + counter1);





    }
}
