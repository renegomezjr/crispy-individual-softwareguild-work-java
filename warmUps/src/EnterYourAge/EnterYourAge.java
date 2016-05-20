/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnterYourAge;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class EnterYourAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userAge = 0;
        
        System.out.println("Hello, friend! How old are you?");
        userAge = sc.nextInt();
        
        if (userAge < 18) {
            System.out.println("You must be in school.");
        } else if (userAge >= 18 && userAge < 65 ) {
            System.out.println("Time to go to work");
        } else {
            System.out.println("Enjoy retirement!");
        }
    }
}
