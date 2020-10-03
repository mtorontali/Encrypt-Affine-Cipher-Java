// Matthew Torontali
// 8/28/20
// Encrypt plain text with affine cipher in Java

import java.util.Scanner;

public class Affine2 {

    // Main method
    public static void main(String []args)
    {
        // initialize scanner object and variables
        Scanner scanner = new Scanner(System.in);
        String message;
        int a;
        int b;
        int m;
        int length;

        // get message and variables from user input
        System.out.println("Enter a message to encrypt: ");
        message = scanner.nextLine();
        // make sure message is all uppercase
        message = message.toUpperCase();
        System.out.println("Enter a key for a (must be coprime with m): ");
        a = scanner.nextInt();
        System.out.println("Enter a key for b (must be between 0 and m): ");
        b = scanner.nextInt();
        System.out.println("Enter a number for m: ");
        m = scanner.nextInt();

        // get length of message
        length = message.length();

        // Decrypt cipher text using decryption formula E(x) = (ax+b)modm
        // We add and subtract 'A' here to wrap around to the correct ascii values
        // This iterates through the message character by character and encrypts it
        // We convert the ascii values back to readable text with the Character.toString method
        for (int i = 0; i < length; i++)
        {
            System.out.print(Character.toString((((a * (message.charAt(i) - 'A')) + b) % m) + 'A'));
        }
        System.out.println("\n");
    }
}