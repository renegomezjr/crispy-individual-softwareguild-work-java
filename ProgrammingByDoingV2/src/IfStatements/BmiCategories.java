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
public class BmiCategories {
    public static void main(String[] args) {
        double meters;
        double kilograms;
        double bmi = 0;
        String category = "";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Your height in meters: ");
        meters = keyboard.nextDouble();
        
        System.out.print("Your weight in kilograms: ");
        kilograms = keyboard.nextDouble();
        bmi = (kilograms / (meters * meters));
        
        if(bmi < 18.5) {
            category += "underweight";
        } else if(18.5 <= bmi && bmi <= 24.9){
            category += "normal weight";
        } else if(25.0 <= bmi && bmi <= 29.9){
            category += "overweight";
        } else {
            category += "obese";
        }
        
        System.out.println("Your BMI is " + bmi);
        System.out.println("BMI Category: " + category);
    }
}
