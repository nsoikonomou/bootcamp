/*
 * Exercise 3 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class PrintIn2Lines {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 digit number: ");

        // Read the user's input, i.e. the 10-digit number.
        String numStr = scanner.nextLine();

        // Print the first line.
        for (int i = 0; i < numStr.length(); i = i + 2) {
            System.out.print(numStr.charAt(i) + " ");
        }
        System.out.println();

        // Print the second line.
        for (int i = 1; i < numStr.length(); i = i + 2) {
            System.out.print(" " + numStr.charAt(i));
        }
        System.out.println();
    }
}
