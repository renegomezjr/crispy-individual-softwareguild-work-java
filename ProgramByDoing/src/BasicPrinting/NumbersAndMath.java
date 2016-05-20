/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicPrinting;

/**
 *
 * @author Rene Gomez
 */
public class NumbersAndMath {
    
    public static void main(String[] args) {
        //print String to console
        System.out.println("I will now count my chickens:");
        //addition and division returns result of expression
        System.out.println("Hens " + (25 + 30 / 6));
        //print String
        System.out.println("Now I will count the eggs:");
        //addition, subtraction, modulo, and division
        System.out.println(3.0 + 2.0 +1.0 - 5.0 + 4 % 2 - 1.0 / 4.0 + 6.0);
        //print String
        System.out.println("Is it true that 3 +2 < 5 - 7?");
        //addition, subtraction, comparison
        System.out.println(3 + 2 < 5 - 7);
        //addition, comparison
        System.out.println("What is 3 + 2? " + (3 + 2) );
        //subtraction, comparison
        System.out.println("What is 5 - 7? " + (5 - 7) );
        //print String
        System.out.println("Oh, that's why it's false.");
        //print String
        System.out.println("How about about some more?");
        //print String, comparison
        System.out.println("Is it greater? " + (5 > -2));
        //print String, comparison
        System.out.println("is is greater or equal? " + (5 >= -2));
        //print String, comparison
        System.out.println("Is is leass or equal? " + (5 <= -2));
    }
    
}
