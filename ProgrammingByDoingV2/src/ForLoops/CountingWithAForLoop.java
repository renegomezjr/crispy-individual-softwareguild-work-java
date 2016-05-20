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
public class CountingWithAForLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Type in a message, and I'll display it five times.");
        System.out.println("Message: ");
        String message = keyboard.nextLine();
        
        for ( int n = 2 ; n <= 10 ; n = n + 2){
            System.out.println(n + ". " + message);
        }
        // n = n + 1 increments n so it is the counter.
        // int n = 1 initializes the counter.
        //
    }
}
