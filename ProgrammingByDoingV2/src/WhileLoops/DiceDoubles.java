/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class DiceDoubles {
    
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int dice1 = 0;
        int dice2 = 0;
        
        do {
            dice1 = r.nextInt(6) + 1;
            dice2 = r.nextInt(6) + 1;

            System.out.println("\nHere comes the dice!"
                             + "\nRoll #1: " + dice1
                             + "\nRoll #2: " + dice2
                             + "\nThe total is " + (dice1 + dice2));
            Thread.sleep(1000);
        }while( dice1 != dice2 );
    }
}
