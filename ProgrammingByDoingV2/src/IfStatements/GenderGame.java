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
public class GenderGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userGender;
        String firstName;
        String lastName;
        int userAge;
        String married;

        System.out.println("What is your gender (M or F): ");
        userGender = sc.nextLine();
        System.out.println("First name: ");
        firstName = sc.nextLine();
        System.out.println("Last name: ");
        lastName = sc.nextLine();
        System.out.println("Age: ");
        userAge = sc.nextInt();

        if (userGender.equals("F") && userAge >= 20) {
            System.out.println("Are you married, " + firstName + " (y or n)?");
            married = sc.nextLine();
            if (married.equals("y")) {
                System.out.println("Then I shall call you Mrs. " + lastName + ".");
            } else {
                System.out.println("Then I shall call you Ms. " + lastName + ".");
            }
        } else if (userGender.equals("M") && userAge >= 20) {
            System.out.println("Then I shall call you Mr. " + lastName + ".");

        } else if ((userGender.equals("F") || userGender.equals("M")) && userAge < 20) {
            System.out.println("Then I shall call you " + firstName + " " + lastName + ".");

        }
    }
}
