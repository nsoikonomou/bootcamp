/*
 * Exercise 4 from the Python tutorial Part 1 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial1.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class Quadratic {

    public static void main(String args[]) {
        // The variable scanner is used to get the user's input.
        Scanner scanner = new Scanner(System.in);

        // Read the user's input.
        System.out.print("Enter value for 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for 'c': ");
        double c = scanner.nextDouble();

        // Compute the solutions.
        if ((Math.pow(b, 2) - (4 * a * c)) < 0) {
            System.out.println("No real-valued solutions exist.");
        } else {
            double sol1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
            double sol2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
            System.out.println("The solutions are " + sol1 + " and " + sol2 + ".");
        }

    }
}
