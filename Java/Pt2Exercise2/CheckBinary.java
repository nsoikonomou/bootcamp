/*
 * Exercise 2 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class CheckBinary {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary number: ");

        // Read the user's input, i.e. the 8-bit binary number to be checked.
        String binaryNumber = scanner.nextLine();

        int count = 0;

        // Count the sum of the 1 bits.        
        for (int i = 0; i < 7; i++) {
            if (binaryNumber.charAt(i) == '1') {
                count++;
            }
        }

        // Check if the parity bit is OK and print the result.
        if ((count % 2 == 0 && binaryNumber.charAt(7) == '0') || (count % 2 != 0 && binaryNumber.charAt(7) == '1')) {
            System.out.println("Parity check OK.");
        } else {
            System.out.println("Parity check not OK.");
        }
    }
}
