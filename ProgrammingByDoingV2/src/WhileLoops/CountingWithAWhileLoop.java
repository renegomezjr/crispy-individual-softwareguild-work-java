/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class CountingWithAWhileLoop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        
        System.out.println("How many times would you like that displayed?");
        int times = keyboard.nextInt();
        
        int n = 1;
        while (n <= times) {
            System.out.println((n * 10) + ". " + message);
            n++;
        }
    }
}
