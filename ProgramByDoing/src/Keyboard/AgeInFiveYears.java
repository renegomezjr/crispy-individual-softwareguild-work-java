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
public class AgeInFiveYears {
    public static void main( String[] args ) {
	int age;
	String name;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello. What is your name? " );
        name = keyboard.nextLine();
        
	System.out.print( "Hi, " + name + "! How old are you? " );
        age = keyboard.nextInt();

        System.out.println( "Did you know that in five years you will be " + (age + 5) + " years old? \n"
                          + "And five years ago you were " + (age - 5) + "! Imagine that!");
	}
    
}
