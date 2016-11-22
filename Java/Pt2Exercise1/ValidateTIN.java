/*
 * Exercise 1 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */
import java.util.Scanner;

public class ValidateTIN {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Tax Identification Number: ");
        // Read the user's input, i.e. the TIN to be checked.
        String taxNumber = scanner.nextLine();

        int digits[] = new int[8];
        // Assign the value of the check digit to the variable checkDigit.
        int checkDigit = Integer.parseInt(taxNumber.substring(8));
        int sumOfPowers = 0;

        // Do all necessary calculations and checks.
        for (int i = 0, j = 7; i <= 7 && j >= 0; i++, j--) {
            digits[i] = (int) (Integer.parseInt(taxNumber.substring(j, j + 1)) * Math.pow(2, i + 1));
        }

        for (int x = 0; x < digits.length; x++) {
            sumOfPowers = sumOfPowers + digits[x];
        }

        int result = (sumOfPowers % 11) % 10;
        if (result == checkDigit) {
            System.out.println("Tax Identification Number valid.");
        } else {
            System.out.println("Tax Identification Number not valid.");
        }

    }
}
