/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoops;

import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class BabyBlackJack {
    public static void main(String[] args) {
        int dealCard1 = 0;
        int dealCard2 = 0;
        int dealerTotal = 0;
        int playCard1 = 0;
        int playCard2 = 0;
        int playerTotal = 0;
        
        Random r = new Random();

        System.out.println("Baby Blackjack!\n");
        playCard1 = r.nextInt(10) + 1;
        playCard2 = r.nextInt(10) + 1;
        playerTotal = playCard1 + playCard2;
        dealCard1 = r.nextInt(10) + 1;
        dealCard2 = r.nextInt(10) + 1;
        dealerTotal = dealCard1 + dealCard2;
        
        
        System.out.println("You drew " + playCard1 + " and " + playCard2 +
                           "\nYour total is " + playerTotal);
        
        System.out.println("\nThe dealer has " + dealCard1 + " and " + dealCard2 +
                            "\nDealer's total is " + dealerTotal);
        
        if (playerTotal >= dealerTotal) {
            System.out.println("\nYou win!");
        } else {
            System.out.println("\nYou lost.");
        }
    }
    
}
