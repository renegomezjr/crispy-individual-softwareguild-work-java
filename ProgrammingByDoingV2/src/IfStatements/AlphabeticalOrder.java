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
public class AlphabeticalOrder {
    
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's your last name? ");
        name = sc.nextLine();
        
        if("Carswell".compareTo(name) >= 0){
            System.out.println("You don't have to wait long, \"" + name + "\".");
        }else if ("Jones".compareTo(name) >= 0){
            System.out.println("that's not bad, \"" + name + "\".");
        }else if ("Smith".compareTo(name) >= 0){
            System.out.println("looks like a bit of a wait, \"" + name + "\".");
        }else if ("Young".compareTo(name) >= 0){
            System.out.println("It's gonna be a while, \"" + name + "\".");
        }else if("Young".compareTo(name) < 0){
            System.out.println("not going anywhere for a while, \"" + name + "\".");
        }
        
    }
    
}
