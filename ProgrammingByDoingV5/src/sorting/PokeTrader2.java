/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class PokeTrader2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[] pokeParty = {"PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY"};

        int a;
        int b;
        String swapper;

        do {
            System.out.println("EXCHANGE POKEMON\n");
            for (int i = 0; i < pokeParty.length; i++) {
                System.out.println("    " + i + ". " + pokeParty[i]);
            }

            System.out.print("\nChoose a Pokemon (or -1 to quit). => ");
            a = keyboard.nextInt();

            if (a >= 0) {
                System.out.print("Choose a Pokemon to exchange with " + pokeParty[a] + ". => ");
                b = keyboard.nextInt();

                System.out.println("\nExchanging " + pokeParty[a] + " with " + pokeParty[b] + ".\n");

                // add code here to swap the Pokemon in slot a with the Pokemon in slot b
                swapper = pokeParty[a];
                pokeParty[a] = pokeParty[b];
                pokeParty[b] = swapper;
            }

        } while (a >= 0);

    }
}
