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
public class TheWorstNumberGuessingGameEver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int gameNum = 3;
        
        System.out.println("The Worst Numer Guessing Game Ever!");
        System.out.println("I'm thinking of a number from 1 to 10");
        System.out.println("Can you guess? ");
        int guessNum = keyboard.nextInt();

        if (gameNum == guessNum) {
            System.out.println("Wow, you guessed it!");
        } else {
            System.out.println("Nope! It was " + gameNum + ". You stink at this.");

        }
    }
}
