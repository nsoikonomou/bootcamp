/*
 * Exercise 9 from the Python tutorial Part 2 on:
 * https://codeandwork.github.io/courses/prep/pythonTutorial2.html

 * Exercise must be written in Java.
 */

import java.util.Scanner;

public class CaesarCipher {

    static void encrypt(int shiftChar, String phraseToEncrypt) {
        // Convert the phrase to a new character array.
        char[] toEncode = phraseToEncrypt.toCharArray();
        char[] encryptedPhrase = new char[toEncode.length];

        // Loop over characters.
        for (int i = 0; i < toEncode.length; i++) {
            char encodedLetter = (char) (toEncode[i] + shiftChar);
            encryptedPhrase[i] = encodedLetter;

            // Shift letter, moving back or forward 26 places if needed.
            if (encodedLetter > 'Z') {
                encodedLetter = (char) (encodedLetter - 26);
                System.out.print(encodedLetter);

            } else if (encodedLetter < 'A') {
                encodedLetter = (char) (encodedLetter + 26);
                System.out.print(encodedLetter);

            } else {
                System.out.print(encodedLetter);
            }
        }
        System.out.println();
        CaesarCipher.decrypt(shiftChar, String.valueOf(encryptedPhrase));
    }

    static void decrypt(int shiftChar, String phraseToDecrypt) {
        // Convert the encrypted phrase to a new character array.
        char[] toDecode = phraseToDecrypt.toCharArray();

        // Loop over characters.
        for (int i = 0; i < toDecode.length; i++) {
            char decodedLetter = (char) (toDecode[i] - shiftChar);

            // Shift letter, moving back or forward 26 places if needed.
            if (decodedLetter > 'Z') {
                decodedLetter = (char) (decodedLetter - 26);
                System.out.print(decodedLetter);
            } else if (decodedLetter < 'A') {
                decodedLetter = (char) (decodedLetter + 26);
                System.out.print(decodedLetter);
            } else {
                System.out.print(decodedLetter);
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shift: ");
        // Read the user's input, i.e. the number of positions to shift each character in the phrase.
        int shift = scanner.nextInt();

        System.out.print("Enter phrase: ");
        // Read the user's phrase.
        String phrase = scanner.next();

        CaesarCipher.encrypt(shift, phrase);
    }
}
