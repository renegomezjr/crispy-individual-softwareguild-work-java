/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class ThreeCardMonte {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        int gameNum = (r.nextInt(3) + 1);
        System.out.println(gameNum);


        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n"
                + "He glances at you out of the corner of his eye and starts shuffling.\n"
                + "He lays down three cards.");
        System.out.println("Which one is the ace?\n"
                + "##  ##  ##\n"
                + "##  ##  ##\n"
                + "1   2   3\n");
        int guessNum = keyboard.nextInt();

        if (gameNum == 1) {
            if (gameNum == guessNum) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n"
                        + "AA  ##  ##\n"
                        + "AA  ##  ##\n"
                        + "1   2   3\n");
            } else {
                System.out.println("Ha! Fast Eddie wins again! The ace was card number 1.\n"
                        + "AA  ##  ##\n"
                        + "AA  ##  ##\n"
                        + "1   2   3\n");
            }
        } else if (gameNum == 2) {
            if (gameNum == guessNum) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n"
                        + "##  AA  ##\n"
                        + "##  AA  ##\n"
                        + "1   2   3\n");
            } else {
                System.out.println("Ha! Fast Eddie wins again! The ace was card number 2.\n"
                        + "##  AA  ##\n"
                        + "##  AA  ##\n"
                        + "1   2   3\n");
            }
        } else if (gameNum == 3) {
            if (gameNum == guessNum) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n"
                        + "##  ##  AA\n"
                        + "##  ##  AA\n"
                        + "1   2   3\n");
            } else {
                System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.\n"
                        + "##  ##  AA\n"
                        + "##  ##  AA\n"
                        + "1   2   3\n");
            }
        }

    }

}
