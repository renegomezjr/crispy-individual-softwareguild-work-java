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
public class AddingValuesInALoop {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        int sum = 0;

        System.out.println("I will add up all the numbers you give me");

        boolean keepAdding = true;

        while (keepAdding) {
            System.out.println("Number: ");
            int userNums = keyboard.nextInt();
            if (userNums == 0) {
                System.out.println("The total is " + sum);
                keepAdding = false;
            } else {
                sum += userNums;
                System.out.println("Your total so far is " + sum);

            }

        }

    }

}
