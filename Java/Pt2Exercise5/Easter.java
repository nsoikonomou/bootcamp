/*
 * Exercise 5 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class Easter {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");

        // Read the user's input, i.e the year for which to compute Orthodox Easter Sunday.
        int year = scanner.nextInt();

        int a = year % 4;
        int b = year % 7;
        int c = year % 19;
        int d = (19 * c + 15) % 30;
        int e = (2 * a + 4 * b - d + 34) % 7;
        int month = (int) Math.floor((d + e + 114) / 31);
        int julianDay = ((d + e + 114) % 31) + 1;

        // Convert the result from the Julian calendar to Gregorian calendar.
        int gregorianDay = julianDay + 13;

        /* If the month is March and the day is larger than 31, change both the month to
         April and the day respectively. */
        if (month == 3 && gregorianDay > 31) {
            month = 4;
            gregorianDay = gregorianDay - 31;
        }
        /* If the month is April and the day is larger than 30, change both the month to
         May and the day respectively. */
        if (month == 4 && gregorianDay > 30) {
            month = 5;
            gregorianDay = gregorianDay - 30;
        }
        System.out.println("Day: " + gregorianDay + " Month: " + month);
    }
}
