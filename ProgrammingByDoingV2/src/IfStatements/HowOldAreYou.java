/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfStatements;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class HowOldAreYou {
    public static void main(String[] args) {
        int age;
        String name;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Hey, what's your name? ");
        name = keyboard.nextLine();
        
        System.out.println("Ok, " + name + ", how old are you? ");
        age = keyboard.nextInt();
        
        if (age < 16) { 
            System.out.println("You can't drive");
        }
        
        if (age < 18) {
            System.out.println("You can't vote.");
        }
       
        if (age < 25) {
            System.out.println("You can't rent a car.");
        }
        
        if (age > 25) {
            System.out.println("You can do anything that's legal.");
        }
    } 
}
