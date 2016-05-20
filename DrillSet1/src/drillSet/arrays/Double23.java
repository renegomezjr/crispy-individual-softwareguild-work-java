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
public class Double23 {
//    Given an int array, return true if the array contains 2 twice, or 3 twice.

    public boolean Double23(int[] numbers) {
        int counter2 = 0;
        int counter3 = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                counter2++;
            } else if (numbers[i] == 3) {
                counter3++;
            }
        }

        if ((counter2 == 2) || (counter3 == 2)) {
            return true;
        } else {
            return false;
        }
    }

}
