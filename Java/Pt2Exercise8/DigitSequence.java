/*
 * Exercise 8 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class DigitSequence {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number sequence: ");

        // Read the user's number sequence.
        String numSequence = scanner.nextLine();

        // Split each digit in the sequence into a String array.
        String digits[] = numSequence.split("");
        int result = 0;

        // Calculate and print the result.
        for (int i = 0; i < digits.length; i = i + 2) {
            if (i == digits.length - 1) {
                result = result + Integer.parseInt(digits[digits.length - 1]);
                break;
            }
            result = result + Integer.parseInt(digits[i]) * Integer.parseInt(digits[i + 1]);
        }
        System.out.println(result);
    }
}
