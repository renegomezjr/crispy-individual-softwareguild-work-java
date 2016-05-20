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
public class Count9 {

    public int Count9(int[] numbers) {
        int counter = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 9){
                counter++;
            }
        }
        return counter;
    }
}
