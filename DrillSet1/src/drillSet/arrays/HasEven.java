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
public class HasEven {
//    Given an int array , return true if it contains an even number (HINT: Use Mod (%)). 

    public boolean HasEven(int[] numbers) {
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                return true;
            }
        }
        
        return false;
    }
}
