/*
 * Exercise 10 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class LongestRunZerosOnes {

    static int zeroCount = 0;
    static int oneCount = 0;
    static int longestZeroRun = 0;
    static int longestOneRun = 0;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary sequence: ");

        // Read the user's binary sequence.
        String sequence = scanner.nextLine();

        // Count the longest run of ones.
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '1') {
                oneCount += 1;
                if (oneCount > longestOneRun) {
                    longestOneRun = oneCount;
                }

            } else if (sequence.charAt(i) == '0') {
                if (oneCount > longestOneRun) {
                    longestOneRun = oneCount;
                }
                oneCount = 0;
            }
        }

        // Count the longest run of zeros.
        for (int j = 0; j < sequence.length(); j++) {
            if (sequence.charAt(j) == '0') {
                zeroCount += 1;
                if (zeroCount > longestZeroRun) {
                    longestZeroRun = zeroCount;
                }

            } else if (sequence.charAt(j) == '1') {
                if (zeroCount > longestZeroRun) {
                    longestZeroRun = zeroCount;
                }
                zeroCount = 0;
            }
        }

        if (longestOneRun > longestZeroRun) {
            System.out.println("Longest run was ones with length: " + longestOneRun);
        }
        if (longestOneRun < longestZeroRun) {
            System.out.println("Longest run was zeros with length: " + longestZeroRun);
        }
        if (longestOneRun == longestZeroRun) {
            System.out.println("Equal longest run of ones and zeros with length: " + longestOneRun);
        }
    }
}
