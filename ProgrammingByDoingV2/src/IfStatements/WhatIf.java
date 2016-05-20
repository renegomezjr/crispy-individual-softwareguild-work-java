/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfStatements;

/**
 *
 * @author Rene Gomez
 */
public class WhatIf {

    public static void main(String[] args) {
        int people = 20;
        int cats = 20;
        int dogs = 15;
        
        //evaluates true
        if (people < cats) { //this is a code block that runs if the boolean is true
            System.out.println("Too many cats!  The world is doomed!");
        }
        //evaluates false
        if (people > cats) {
            System.out.println("Not many cats!  The world is saved!");
        }
        //evaluates false
        if (people < dogs) {
            System.out.println("The world is drooled on!");
        }
        //evaluates true
        if (people > dogs) {
            System.out.println("The world is dry!");
        }

        dogs += 5;
        //evaluates true
        if (people >= dogs) {
            System.out.println("People are greater than or equal to dogs.");
        }
        //evaluates evaluates true
        if (people <= dogs) {
            System.out.println("People are less than or equal to dogs.");
        }
        //evaluates true
        if (people == dogs) {
            System.out.println("People are dogs.");
        }
    }
}
