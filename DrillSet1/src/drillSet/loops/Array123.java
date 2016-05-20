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
public class Array123 {

    public boolean Array123(int[] numbers) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                count1++;

            } else if (numbers[i] == 2) {
                count2++;

            } else if (numbers[i] == 3) {
                count3++;
            }

        }
        if (count1 > 0 && count2 > 0 && count3 > 0) {
            return true;
        } else {
            return false;
        }

    }
}
