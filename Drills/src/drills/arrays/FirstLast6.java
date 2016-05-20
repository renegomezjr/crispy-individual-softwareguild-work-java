/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drills.arrays;

/**
 *
 * @author Rene Gomez
 */
public class FirstLast6 {
    
    public boolean firstLast6(int[] numbers){
        if (numbers[0] == 6)
            return true;
        if (numbers[numbers.length - 1] == 6)
        return true;
        
        return false;
    }
    
}
