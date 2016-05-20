/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class KeychainsForSale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice;
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Ye Olde Keychain Shoppe");
            System.out.println("1. Add Keychains to Order\n"
                    + "2. Remove Keychains from Order\n"
                    + "3. View Current Order\n"
                    + "4. Checkout");

            System.out.println("Please enter your choice");
            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    add_keychains();
                    break;
                case 2:
                    remove_keychains();
                    break;
                case 3:
                    view_order();
                    break;
                case 4:
                    keepRunning = false;
                    checkout();
                    break;
            }

        }

//        : 1
//
//ADD KEYCHAINS
//
//
//
//CHECKOUT
    }

    public static void add_keychains() {
        System.out.println("ADD KEYCHAINS");
    }

    public static void remove_keychains() {
        System.out.println("REMOVE KEYCHAINS");
    }

    public static void view_order() {
        System.out.println("VIEW ORDER");
    }

    public static void checkout() {
        System.out.println("CHECKOUT");
    }

}
