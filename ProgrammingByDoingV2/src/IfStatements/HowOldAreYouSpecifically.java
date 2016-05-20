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
public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        int age;
        String name;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        name = keyboard.nextLine();
        
        System.out.println("Ok, " + name + ", how old are you? ");
        age = keyboard.nextInt();
        
        if (age < 16) { 
            System.out.println("You can't drive");
        } else if (age >= 16 && age <= 17) {
            System.out.println("You can drive but you can't vote.");
        } else if (age >= 18 && age < 25) {
            System.out.println("You can vote but not rent a car.");
        } else if (age >= 25) {
            System.out.println("You can do pretty much anything.");
        }
    } 
}
