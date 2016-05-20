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
public class HigherWins {
    public int[] higherWins(int[] numbers) {
        int max = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = max;
        }
        
        return numbers;
    }
}
