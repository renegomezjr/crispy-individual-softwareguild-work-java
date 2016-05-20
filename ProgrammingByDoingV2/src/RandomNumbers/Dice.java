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
public class Dice {
    
    public static void main(String[] args) {
        Random r = new Random();
        
        int dice1 = r.nextInt(6) + 1;
        int dice2 = r.nextInt(6) + 1;
        
        System.out.println("Here comes the dice!"
                         + "\nRoll #1: " + dice1
                         + "\nRoll #2: " + dice2
                         + "\nThe total is " + (dice1 + dice2));
        
    }
    
}
