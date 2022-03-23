package com.company;
import java.time.LocalDate;
import java.time.Period;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class class_03_23 {
    public static void main(String[] args) {

        // Write a Java program to get year and months between two dates.
//        LocalDate today = LocalDate.now();
//        LocalDate userDay = LocalDate.of(2020,07, 23);
//        Period difference = Period.between(userDay, today);
//
//        System.out.println("The difference between" + userDay +" - "+today+ ": "+difference.getYears()+ " years " + " and "
//                + difference.getMonths() + "months.");
//
//        // Write a Java program to calculate the difference between two dates in days.
//        LocalDate userdate1 = LocalDate.of(2022, 1, 3);
//        LocalDate userdate2 = LocalDate.of(2022, 3, 22);
//
//        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(userdate1, userdate2));
//
//        System.out.println("The difference between them in days is: " + numberOfDaysBetween);

        // task 1:
        // Write a program to calculate the age of a person considering that they ( the user) only enters
        // their date of birth

        LocalDate today = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth in YYYY-MM-DD format:");
        String userDateOfBirth = scanner.nextLine();
        LocalDate dateBirth = LocalDate.parse(userDateOfBirth);
        Period difference = Period.between(dateBirth, today);

        System.out.println("Based on your date of birth, your age is: " + difference.getYears() + " years.");


        // task 2:
        // Write a program to calculate the number of days between two specified years.

        System.out.println("Enter two dates you want to get the difference between:");
        System.out.println("Enter date 1 (format: YYYY-MM-DD):");
        String userYear1 = scanner.nextLine();
        System.out.println("Enter year 2 (format: YYYY-MM-DD):");
        String userYear2 = scanner.nextLine();
        LocalDate year1 = LocalDate.parse(userYear1);
        LocalDate year2 = LocalDate.parse(userYear2);

        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(year1, year2));

        System.out.println("The difference between them in days is: " + numberOfDaysBetween);


    }
}
