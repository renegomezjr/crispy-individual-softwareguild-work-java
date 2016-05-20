/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keyboard;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class ADumbCalculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is your first number? ");
        num1 = keyboard.nextDouble();
        
        System.out.print("What is your first number? ");
        num2 = keyboard.nextDouble();
        
        System.out.print("What is your first number? ");
        num3 = keyboard.nextDouble();
        
        System.out.println("( " + num1 + " + " + num2 + " + " + num3 + " ) " + " / " + "2 is ..." + ((num1 + num2 + num3)/ 2));
        
    }
    
}
