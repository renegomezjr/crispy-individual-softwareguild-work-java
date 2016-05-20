/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoopsPart2;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Square Root!\n"
                         + "Enter a number: ");
        int num = sc.nextInt();
        double root;
        
        while (num < 0 ) {
            System.out.println("You can't take the square of a negative number, dummy. Try again.");
            num = sc.nextInt();
        }
        
        if (num >= 0) {
            root = Math.sqrt(num);
            System.out.println("The square root of " + num + " is " + root + ".");
        } 
        
        
    }
}
