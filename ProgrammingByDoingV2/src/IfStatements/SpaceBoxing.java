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
public class SpaceBoxing {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWeight = 0;
        double planetGrav = 0;
        
        System.out.println("Please enter your current earth weight: ");
        userWeight = sc.nextInt();
        
        System.out.println("\nI have information for the following planets: \n"
                         + "1. Venus \t2. Mars  \t3. Jupiter\n"
                         + "4. Saturn\t5. Uranus\t6. Neptune\n"
                         + "\nWhich planet are you visiting?");
        int userInput = sc.nextInt();
        
        if (userInput == 1) {
            planetGrav = .78; //Venus
        } else if (userInput == 2) {
            planetGrav = .39; //Mars
        } else if (userInput == 3) {
            planetGrav = 2.65; //Jupiter
        } else if (userInput == 4) {
            planetGrav = 1.17; //Saturn
        } else if (userInput == 5) {
            planetGrav = 1.05; //Uranus
        } else if (userInput == 6) {
            planetGrav = 1.23; //Neptune
        } else {
            System.out.println("You didn't enter a valid number.");
        }
        
        double planetWeight = (userWeight * planetGrav);
        
        System.out.println("Your weight would be " + planetWeight + " pounds on that planet.");
        
    }
}
