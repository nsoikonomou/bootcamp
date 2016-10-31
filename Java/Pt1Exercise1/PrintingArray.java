/*
 * Part 1 Exercise 1 from the Python tutorial on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial1.html
 
 * Exercise is to be written in Java.
 */
import java.util.Arrays;

public class PrintingArray {

    // Declare and initiliaze a default static array of length: 9.
    static int[] src = new int[9];

    public static void main(String args[]) {
        int fromSrcIndex, val;

        for (fromSrcIndex = 8, val = 1; fromSrcIndex >= 0 && val <= 9; fromSrcIndex--, val++) {
            // The method fill(src, fromSrcIndex, src.length, val) assigns the specified int value val to each element of the specified range of the specified array src of ints.
            Arrays.fill(src, fromSrcIndex, src.length, val);
            for (int i = 0; i < src.length; i++) {
                System.out.print(src[i]);
            }
            System.out.println();
        }
    }
}
