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
public class BmiCalculator {
    public static void main(String[] args) {
        double meters;
        double kilograms;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Your height in meters: ");
        meters = keyboard.nextDouble();
        
        System.out.print("Your weight in kilograms: ");
        kilograms = keyboard.nextDouble();
        
        System.out.println("Your BMI is " + (kilograms / (meters * meters)));
    }
    
}
