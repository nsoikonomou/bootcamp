/*
 * Exercise 11 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class PoliteNumbers {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter limit: ");

        // Read the user's input, i.e. the upper limit of polite numbers.
        int limit = scanner.nextInt();

        int oddDivCount = 0;
        int printPoliteRowCount = 0;

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j = j + 2) {
                // Count the number of odd divisors of i.
                if (i % j == 0) {
                    oddDivCount++;
                }
            }

            // If the number of odd divisors of i is greater than 1, then i is a polite number.
            if (oddDivCount > 1) {

                // Print polite number i.
                System.out.print(i + " ");

                printPoliteRowCount++;

                // If a row prints exactly 10 polite numbers, then change row and reset the count.
                if (printPoliteRowCount == 10) {
                    System.out.println();
                    printPoliteRowCount = 0;
                }
            }

            // Reset the number of odd divisors.
            oddDivCount = 0;
        }
    }
}
