/*
 * Exercise 5 from the Python tutorial Part 1 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial1.html

 * Exercise must be written in Java.
 */

public class Harmonic {

    public static void main(String args[]) {
        double sum = 1.0;
        for (int i = 1; i <= 5; i++) {
            // Print the first term of the harmonic sequence.
            if (i == 1) {
                System.out.println((int) sum);
            }
            // Compute and print the remaining four terms of the harmonic sequence.
            if (i > 1) {
                double step = (double) 1 / i;
                sum = sum + step;
                System.out.println(sum);
            }
        }
    }
}
