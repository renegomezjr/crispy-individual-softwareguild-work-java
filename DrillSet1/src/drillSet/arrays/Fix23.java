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
public class Fix23 {
//    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array. 

    public int[] Fix23(int[] numbers) {
//        int[] arr = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] == 2) && (numbers[i + 1] == 3)) {
                numbers[i + 1] = 0;
            } 
        }
        return numbers;
    }
}
