/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class KeepGuessing {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        int gameNum = (r.nextInt(10) + 1);
//        System.out.println(gameNum);
        
        System.out.println("I'm thinking of a number from 1 to 10");
        System.out.println("Can you guess? ");
        int guessNum = keyboard.nextInt();
        
        while (gameNum != guessNum) {
            System.out.println("Nope! you stink at this. Guess again!");
            guessNum = keyboard.nextInt();
        }
        
        System.out.println("Wow, you guessed it!");
    }
}
