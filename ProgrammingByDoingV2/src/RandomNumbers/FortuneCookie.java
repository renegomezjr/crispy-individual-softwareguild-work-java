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
public class FortuneCookie {
    public static void main(String[] args) {
        Random r = new Random();

        int choice = 1 + r.nextInt(10);
        String response = "";

        if (choice == 1) {
            response = "You will find love";
        } else if (choice == 2) {
            response = "You will find happiness";
        } else if (choice == 3) {
            response = "Dark times approach";
        } else if (choice == 4) {
            response = "Live at home";
        } else if (choice == 5) {
            response = "You are on the right path";
        } else if (choice == 6) {
            response = "One who finds a friend finds hope";
        } else if (choice == 7) {
            response = "Riches are temporary";
        } else if (choice == 8) {
            response = "Find the path of peace";
        } else if (choice == 9) {
            response = "There is much happiness in contentment";
        } else if (choice == 10) {
            response = "Make friendships last";
        } else {
            response = "ERROR!";
        }

        System.out.println("Fortune cookie says: " + response);
    }
    
}
