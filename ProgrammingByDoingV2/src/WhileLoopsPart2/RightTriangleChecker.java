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
public class RightTriangleChecker {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        System.out.println("Enter three integers: ");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Side 1: ");
        a = sc.nextInt();
        
        while(a < 1) {
            System.out.println("Your first side must be 1 or more!");
            System.out.print("Side 1: ");
            a = sc.nextInt();
        }
        
        System.out.print("Side 2: ");
        b = sc.nextInt();
        
        while(b < a) {
            System.out.println(b + " is less than Side 1. Your second side must be\n"
                                 + "greater or equal to your first");
            System.out.print("Side 2: ");
            b = sc.nextInt();
        }
        
        System.out.print("Side 3: ");
        c = sc.nextInt();
        
        while(c < b) {
            System.out.println(c + " is less than Side 2. Your third side must be\n"
                                 + "greater or equal to your second.");
            System.out.print("Side 3: ");
            c = sc.nextInt();
        }
        
        System.out.println("Side 3: " + c);
        System.out.println("Your three sides are " + a + " " + b + " " + c);
        
        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("Yes! These sides make a right triangle!");
        } else {
            System.out.println("No! These sides do not make a right triangle!");
        }
    }
}
