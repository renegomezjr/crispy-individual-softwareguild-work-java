/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.arrays;

/**
 *
 * @author Rene Gomez
 */
public class Unlucky1 {
//    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
//Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array. 

    public boolean Unlucky1(int[] numbers) {
        
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0 || i == 1) {
                if ((numbers[i] == 1) && (numbers[i + 1] == 3)) {
                    return true;
                }
            } else if ((numbers[numbers.length - 2] == 1) && (numbers[numbers.length - 1] == 3)) {
                return true;
            }
        }
        return false;
    }

}
