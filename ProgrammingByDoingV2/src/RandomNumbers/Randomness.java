/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomNumbers;

import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class Randomness {

    public static void main(String[] args) {
        Random r = new Random(); //putting a seed number makes it choose a number and keep it.

        int x = 1 + r.nextInt(10);

        System.out.println("My random number is " + x);
        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print(2 + r.nextInt(10) + " "); // numbers between 3-7
        System.out.print(2 + r.nextInt(10) + " ");
        System.out.print(2 + r.nextInt(10) + " ");
        System.out.print(2 + r.nextInt(10) + " ");
        System.out.print(2 + r.nextInt(10) + " ");
        System.out.print(2 + r.nextInt(10) + " ");
        System.out.println();

        System.out.println("Here are some numbers from 1 to 100!");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.println();

        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if (num1 == num2) {
            System.out.println("The random numbers were the same! Weird.");
        }
        if (num1 != num2) {
            System.out.println("The random numbers were different! Not too surprising, actually.");
        }
    }
}
