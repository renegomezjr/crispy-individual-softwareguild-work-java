/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

/**
 *
 * @author Rene Gomez
 */
public class Array667 {

    public int Array667(int[] numbers) {
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++) {

            if (i + 1 < numbers.length && numbers[i] == 6 && (numbers[i+1] == 6 || numbers[i+1] == 7)) {
                count++;
            }
        }
        
        return count;
    }
}
