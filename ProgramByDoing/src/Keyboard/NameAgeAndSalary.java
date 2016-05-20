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
public class NameAgeAndSalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    
        String name;
        int age;
        double wageAtJob;
    
        System.out.print("Hello, What is your name? ");
        name = keyboard.nextLine();
        
        System.out.print("Hi, " + name + "!" + " How old are you? ");
        age = keyboard.nextInt();
        
        System.out.print("So you're " + age + ", eh? That's not old at all?\n"
                         + "How much do you make, " + name + "? ");
        wageAtJob = keyboard.nextDouble();
        
        System.out.print(wageAtJob + "!" + "I hope that's per hour and not per year! LOL!");
    }
}
