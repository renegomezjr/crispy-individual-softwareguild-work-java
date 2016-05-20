/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoops;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class LettersAtATime {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();

        System.out.println("\nYour message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");
        
        //if you changed it to <= you would have an out of bounds exception.
        //if the word "box" is used, the length is 3 and 'x' is at position 2.
        //it repeats because the loop must cycle through the positions, not the full length.
        for (int i = 0; i < message.length(); i++) {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
        }

        int vowel_count = 0;

        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E'|| letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
                vowel_count++;
            }
        }

        System.out.println("\nYour message contains " + vowel_count + " vowels. Isn't that interesting?");

    }
}
