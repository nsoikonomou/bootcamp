/*
 * Exercise 3 from the Python tutorial Part 1 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial1.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class TriangleArea {

    public static void main(String args[]) {
        // The variable scanner is used to get the user's input.
        Scanner scanner = new Scanner(System.in);

        // Read the user's input,
        System.out.println("Give the length of each side in cm in order to compute the area of a triangle.");
        System.out.print("Give the length of side A: ");
        double lenA = scanner.nextDouble();
        System.out.print("Give the length of side B: ");
        double lenB = scanner.nextDouble();
        System.out.print("Give the length of side C: ");
        double lenC = scanner.nextDouble();

        // Compute the triangle area.
        double triangleArea = (1.0 / 4.0) * Math.sqrt((lenA + lenB + lenC) * (-lenA + lenB + lenC) * (lenA - lenB + lenC) * (lenA + lenB - lenC));
        System.out.println("The triangle area is: " + triangleArea + " square cm.");
    }

}
