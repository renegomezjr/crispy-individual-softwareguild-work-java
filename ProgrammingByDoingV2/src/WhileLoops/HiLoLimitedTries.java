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
public class HiLoLimitedTries {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        int gameNum = (r.nextInt(100) + 1);
        int counter = 0;
//        System.out.println(gameNum);

        System.out.println("I'm thinking of a number from 1 to 100");
        System.out.println("Can you guess? "
                + "\nFirst guess: ");
        int guessNum = keyboard.nextInt();
 

        while (gameNum != guessNum && counter < 6) {
            counter++;
            if (gameNum > guessNum) {
                System.out.println("Sorry, you guessed too low!");
            } else {
                System.out.println("Sorry, you guessed too high!");
            }
            
            System.out.println("Guess #" + (counter + 1));
            guessNum = keyboard.nextInt();

        }

        if (gameNum == guessNum) {
            System.out.println("Wow, you guessed it! What are the odds?!");
        }else{
            System.out.println("Sorry, you didn't guess in 7 tries. You lose. My number was " + gameNum);
        }
    }

   
}
