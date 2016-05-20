/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBlackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class Blackjack {
    public static void main(String[] args) {
        int dealCard1 = 0;
        int dealCard2 = 0;
        int dealHitCard = 0;
        int dealerTotal = 0;
        int playCard1 = 0;
        int playCard2 = 0;
        int playHitCard = 0;
        int playerTotal = 0;
        String userInput = "";
        
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!\n");
        playCard1 = r.nextInt(10) + 2;
        playCard2 = r.nextInt(10) + 2;
        playerTotal = playCard1 + playCard2;
        dealCard1 = r.nextInt(10) + 2;
        dealCard2 = r.nextInt(10) + 2;
        dealerTotal = dealCard1 + dealCard2;
        
        
        System.out.println("You drew " + playCard1 + " and " + playCard2 +
                           "\nYour total is " + playerTotal);
        
        System.out.println("\nThe dealer has a " + dealCard1 + " showing, and a hidden card."
                         + "\nDealer's total is hidden, too.");
        
        System.out.println("Would you like to \"hit\" or \"stay\"? " );
        userInput = sc.nextLine();
        
        while (userInput.equalsIgnoreCase("hit")) {
            playHitCard = r.nextInt(10) + 2;
            System.out.println("You drew a " + playHitCard);
            playerTotal = playHitCard + playerTotal;
            System.out.println("Your total is " + playerTotal);
            System.out.println("Would you like to \"hit\" or \"stay\"? " );
            userInput = sc.next();
        }
        
        if (playerTotal > 21){
            System.out.println("\nYou bust!");
        }
        
        System.out.println("\nOkay, dealer's turn.");
        System.out.println("Dealer's hidden card was a " + dealCard2
                             + "\nDealer's total is " + dealerTotal);
        
        while (dealerTotal <= 16 && playerTotal <= 21) {
            System.out.println("\nDealer chooses to hit.");
            dealHitCard = r.nextInt(10) + 2;
            dealerTotal = dealerTotal + dealHitCard;
            System.out.println("He draws a " + dealHitCard);
            System.out.println("Dealer's total is " + dealerTotal);
        }
        
        
        
        if (dealerTotal > 21) {
            System.out.println("\nDealer bust.");
        } else {
            System.out.println("\nDealer stays.");
        }
        
        System.out.println("\nDealer total is " + dealerTotal
                         + "\nYour total is " + playerTotal);
        
        if (playerTotal >= dealerTotal  && playerTotal <= 21) {
            System.out.println("\nYou win!");
        } else {
            System.out.println("\nYou lost.");
        }
    }
    
}
