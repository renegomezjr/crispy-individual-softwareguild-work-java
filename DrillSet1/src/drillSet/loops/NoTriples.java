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
public class NoTriples {

    public boolean NoTriples(int[] numbers) {
        
        for (int i = 0; i < numbers.length; i++) {
            if(i+2 <= numbers.length && (numbers[i] == numbers[i+1] && numbers[i] == numbers[i+2])){
                return false;
            }
        }
        
        return true;
    }
}
