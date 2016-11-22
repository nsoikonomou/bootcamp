/*
 * Exercise 7 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class DaysCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dates: ");

        // Read the user's input, i.e the string containing the two dates.
        String datesStr = scanner.nextLine();

        // Split the two dates into an array of two substrings.
        String separatedDates[] = datesStr.split(" ");

        // Split each string in separatedDates[] array into an array of three substrings.
        String date1[] = separatedDates[0].split("/");
        String date2[] = separatedDates[1].split("/");

        // Convert each substring containing an integer to actual int type.
        int d1 = Integer.parseInt(date1[0]);
        int d2 = Integer.parseInt(date2[0]);
        int m1 = Integer.parseInt(date1[1]);
        int m2 = Integer.parseInt(date2[1]);
        int y1 = Integer.parseInt(date1[2]);
        int y2 = Integer.parseInt(date2[2]);

        // Calculate the days elapsed between the two dates and display the result.
        int c1 = 365 * y1 + (int) Math.floor(y1 / 4) - (int) Math.floor(y1 / 100) + (int) Math.floor(y1 / 400) + (int) Math.floor((306 * m1 + 5) / 10) + (d1 - 1);
        int c2 = 365 * y2 + (int) Math.floor(y2 / 4) - (int) Math.floor(y2 / 100) + (int) Math.floor(y2 / 400) + (int) Math.floor((306 * m2 + 5) / 10) + (d2 - 1);
        int diff = c2 - c1;
        System.out.println(Math.abs(diff) + " days.");
    }
}
