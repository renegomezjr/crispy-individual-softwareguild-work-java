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
public class Pattern51 {

    public boolean Pattern51(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i + 2 <= numbers.length && (numbers[i] == 2 && numbers[i + 1] == 7 && numbers[i + 2] == 1)) {
                return true;
            }
        }

        return false;
    }
}
