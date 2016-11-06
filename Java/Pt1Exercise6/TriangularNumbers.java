/*
 * Exercise 6 from the Python tutorial Part 1 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial1.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class TriangularNumbers {

    public static void main(String args[]) {
        // The variable scanner is used to get the user's input.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of triangle numbers: ");

        // Read the user's input, i.e. the number of triangle numbers to print.
        int numbers = scanner.nextInt();

        // Print the sequence of triangle numbers.
        for (int i = 1; i <= numbers; i++) {
            System.out.print(i * (i + 1) / 2 + " ");
        }
        System.out.println();
    }
}
