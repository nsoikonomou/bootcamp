/*
 * Exercise 6 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class ColumnPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        // Read the user's input, i.e the 9 numbers to be printed in three columns and in three lines.
        String numbersStr = scanner.nextLine();

        // Split each number in the user's input and assign it to an array of strings.
        String separatedNums[] = numbersStr.split(" ");

        // Print the first line.
        System.out.println("  " + separatedNums[0] + "|  " + separatedNums[3] + "|  " + separatedNums[6]);

        // Print the second line.
        System.out.println(" " + separatedNums[1] + "| " + separatedNums[4] + "| " + separatedNums[7]);

        // Print the third line.
        System.out.println(separatedNums[2] + "|" + separatedNums[5] + "|" + separatedNums[8]);
    }
}
