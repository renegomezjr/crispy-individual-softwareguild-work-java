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
public class EnterYourPin {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("Welcome to the back of Mitchell.");
        System.out.println("Enter your pin: ");
        int entry = keyboard.nextInt();
        
        while ( entry != pin ) {
            System.out.println("\nINCORRECT PIN. try again");
            System.out.println("Enter your pin: ");
            entry = keyboard.nextInt();
        }
        System.out.println("\nPIN accepted.  You now have access to your account.");
    }
    //a while loopp is similar to an if because it is checking for a condition, but unlike an if,
    //it continues to run the block of code until the condition is met.
    
    //there is no int in front of entry because the type has already been declared.
    //there is a forever loop when you delete the entry... from the while loop.
}
