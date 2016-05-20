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
public class ArrayFront9 {

    public boolean ArrayFront9(int[] numbers) {
      
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 9 && i < 4){
                return true;
            }
        }
        return false;
    }
}
