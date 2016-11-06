/*
 * Exercise 2 from the Python tutorial Part 1 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial1.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class EurosSum {

    public static void main(String args[]) {
        // The variable scanner is used to get the user's input.
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize an array of Euro banknotes and coins.
        int euros[] = {50, 20, 10, 5, 2, 1};

        // Declare and initialize an array of the numbers of Euro banknotes and coins.
        int numNotesCoins[] = new int[6];

        int total = 0;

        for (int i = 0; i < euros.length; i++) {
            if (i < 4) {
                System.out.print("Enter number of " + euros[i] + " euro banknotes: ");
            } else {
                System.out.print("Enter number of " + euros[i] + " euro coins: ");
            }
            // Read the user's input, i.e. number of Euro banknotes and coins.
            numNotesCoins[i] = scanner.nextInt();
        }

        // Compute the user's total sum in Euros.
        for (int j = 0; j < numNotesCoins.length; j++) {
            total += numNotesCoins[j] * euros[j];
        }

        System.out.println("You have " + total + " euros.");
    }
}
