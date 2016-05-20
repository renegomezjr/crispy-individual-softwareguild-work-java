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
public class ShortAdventureGame2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice1;
        boolean keepRunning = true;

        System.out.println("An Adventure at the Guild.\n");
        System.out.println("This is your first day of software boot camp.  What will happen?\n");
        
        while (keepRunning) {
            System.out.println("Would you like to go into the conference room and wait, enter 1"
                    + "\n or would you like to go into the classroom and look around, enter 2?");
            userChoice1 = sc.nextInt();

            if (userChoice1 == 1) {
                System.out.println("The conference room is spacious...too spacious."
                        + "\n a lone figure sits at the head of the table with a pistol."
                        + "\n\"Would you like to play a game?\""
                        + "\nYou can either enter 1 to run out of the room and hope you make it"
                        + "\nOr you can enter 2 and play the unknown game...");
                userChoice1 = sc.nextInt();
                if (userChoice1 == 1) {
                    System.out.println("You run out of the room, but you don't know the building, 1 for left, 2 for right...quickly");
                    userChoice1 = sc.nextInt();
                    if (userChoice1 == 1) {
                        System.out.println("You run into a dead end. You don't make it.");
                        keepRunning = false;
                    } else {
                        System.out.println("You are back in the hallway, you have to choose again.");
                        keepRunning = true;
                    }

                } else {
                    System.out.println("The game is lucky 7s.  She let's you decide who will roll first. 1 for her, 2 for you.");
                    userChoice1 = sc.nextInt();
                    if (userChoice1 == 1) {
                        System.out.println("Wrong choice, she never rolls first. But she let's you go back into the hallway and choose again.");
                        keepRunning = true;
                    } else {
                        System.out.println("You only get one roll to make a 7 and live. You roll the dice, snake eyes...");
                        keepRunning = false;

                    }
                }

            } else {
                System.out.println("The classroom is dark with only one computer."
                        + "\nSeveral people are gathered around staring at the screen."
                        + "\n\"Now that you are all here the game can begin. "
                        + "\nYou have 10 minutes to right as many jUnits as you can for the famous Hello World program.\""
                        + "\nYou can either enter 1 to run out of the room and hope you make it"
                        + "\nOr you can enter 2 and accept the challenge...");
                userChoice1 = sc.nextInt();
                if (userChoice1 == 1) {
                    System.out.println("You run out of the room, but you don't know the building, 1 for left, 2 for right...quickly");
                    userChoice1 = sc.nextInt();
                    if (userChoice1 == 1) {
                        System.out.println("You run into a dead end. You don't make it.");
                        keepRunning = false;
                    } else {
                        System.out.println("You make it outside, but a woman runs you down and pulls you back inside. Choose again");
                        keepRunning = true;
                    }

                } else {
                    System.out.println("You are not sure what a jUnit is so you research the topic and make a few. Enter 1 to write 5 jUnits, 2 for 25 jUnits.");
                    userChoice1 = sc.nextInt();
                    if (userChoice1 == 1) {
                        System.out.println("Wrong choice, 5 is far too little. You don't make it.");
                        keepRunning = false;
                    } else {
                        System.out.println("Wrong choice, 25 is far too little. But they let you go home anyway.");
                        keepRunning = false;

                    }
                }
            }
        }

    }
}
