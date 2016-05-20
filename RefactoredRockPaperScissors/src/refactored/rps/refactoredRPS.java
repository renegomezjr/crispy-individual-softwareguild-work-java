/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactored.rps;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class refactoredRPS {

    public static void main(String[] args) {

        int userInput;
        int userRounds;

        int tieCounter = 0;
        int userWin = 0;
        int compWin = 0;
        int playAgain = 0;

        Scanner sc = new Scanner(System.in);
        do {
            welcome();
            userRounds = sc.nextInt();

            if (!(userRounds >= 1 && userRounds <= 10)) {
                endGame();
            } else {
                for (int i = 0; i < userRounds; i++) {
                    gameChoices();
                    userInput = sc.nextInt();

                    while (!(userInput == 1 || userInput == 2 || userInput == 3)) {
                        gameChoices();
                        userInput = sc.nextInt();
                    }

                    Random r = new Random();
                    int computer = r.nextInt(3) + 1;
                    System.out.println("\n" + computer + "\n");

                    switch (userInput) {
                        case 1:
                            if (computer == 1) {
                                int outcome = gameOutcomes(computer, userInput);
                                tieCounter += outcome;
                            } else if (computer == 2) {
                                int outcome = gameOutcomes(computer, userInput);
                                compWin += outcome;
                            } else {
                                int outcome = gameOutcomes(computer, userInput);
                                userWin += outcome;
                            }
                            break;
                        case 2: //2 is tie 3 is comp win
                            if (computer == 2) {
                                int outcome = gameOutcomes(computer, userInput);
                                tieCounter += outcome;
                            } else if (computer == 3) {
                                int outcome = gameOutcomes(computer, userInput);
                                compWin += outcome;
                            } else {
                                int outcome = gameOutcomes(computer, userInput);
                                userWin += outcome;
                            }
                            break;
                        case 3: //3 is tie 1 is compwin
                            if (computer == 3) {
                                int outcome = gameOutcomes(computer, userInput);
                                tieCounter += outcome;
                            } else if (computer == 1) {
                                int outcome = gameOutcomes(computer, userInput);
                                compWin += outcome;
                            } else {
                                int outcome = gameOutcomes(computer, userInput);
                                userWin += outcome;
                            }
                            break;
                    }
                }

                System.out.println("\nWe tied " + tieCounter + " times. You won " + userWin + " round(s).\n"
                        + "And I won " + compWin + " round(s). So, all in all....\n");

                whoIsWinner(userWin, compWin);

                System.out.println("Do you want to play again? Enter 1 for yes!");
                playAgain = sc.nextInt();
            }
        } while (playAgain == 1);

        System.out.println("\nThanks for playing!");
    }

    public static void welcome() {
        System.out.println("Do you like games? I do.\n"
                + "Let's play Rock, Paper, Scissors.\n"
                + "How many rounds would you like to play?\n"
                + "You can play between 1 and 10 rounds:");
    }

    public static void gameChoices() {
        System.out.println("Rock = 1, Paper = 2, Scissors = 3\n"
                + "Enter one of these numbers, and we'll get started!");
    }

    public static void endGame() {
        System.out.println("You don't like games. I hate you.");
    }

    public static int gameOutcomes(int computer, int userInput) {
        switch (userInput) {
            case 1:
                if (computer == 1) {
                    System.out.println("You chose Rock, and so did I. We tied...cool.");
                } else if (computer == 2) {
                    System.out.println("You chose Rock, and I chose Paper. Loser!");
                } else {
                    System.out.println("You chose Rock, and I chose Scissors. You crushed me!");
                }
                break;
            case 2:
                if (computer == 2) {
                    System.out.println("You chose Paper, and so did I. We tied...cool.");
                } else if (computer == 3) {
                    System.out.println("You chose Paper, and I chose Scissors. I'll cut you up!");
                } else {
                    System.out.println("You chose Paper, and I chose Rock. I guess you win!");
                }
                break;
            case 3:
                if (computer == 3) {
                    System.out.println("You chose Scissors, and so did I. Imagine that! We tied!");
                } else if (computer == 1) {
                    System.out.println("You lose!! I crushed your Scissors with my Rock!");
                } else {
                    System.out.println("You chose Scissors, and I chose Paper. I lose. Congrats!");
                }
                break;
        }
        return 1;
    }

    public static void whoIsWinner(int userWin, int compWin) {
        if (userWin > compWin) {
            System.out.println("You win!\n");
        } else if (compWin > userWin) {
            System.out.println("I win!!!\n");
        } else {
            System.out.println("We tied.\n");
        }
    }
}
