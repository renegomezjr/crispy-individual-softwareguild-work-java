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
public class ALittleQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userChoice;
        int quizChoice;
        int countScore = 0;

        System.out.println("Are you ready for a quiz?");
        userChoice = sc.nextLine();
        System.out.println("Okay, here it comes!");

        System.out.println("Q1) What is the capital of Alaska?"
                + "\n1) Melbourne"
                + "\n2) Anchorage"
                + "\n3) Juneau");
        quizChoice = sc.nextInt();
        if (quizChoice == 3) {
            countScore++;
            System.out.println("That's right!");
        } else {
            System.out.println("Ohhh, so close.");
        }

        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?"
                + "\n1) yes"
                + "\n2) no");
        quizChoice = sc.nextInt();
        if (quizChoice == 2) {
            countScore++;
            System.out.println("That's right!");
        } else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }

        System.out.println("Q3) What is the result of 9 + 6/3?"
                + "\n1) 5"
                + "\n2) 11"
                + "\n3) 15/3");
        quizChoice = sc.nextInt();
        if (quizChoice == 2) {
            countScore++;
            System.out.println("That's correct!");

        } else {
            System.out.println("Ohhh, so close.");
        }

        System.out.println("Overall, you got " + countScore + " out of 3 correct.Thanks for playing !");
    }
}
