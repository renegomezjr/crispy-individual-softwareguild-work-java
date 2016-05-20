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
//Given an array of ints length 3, return a new array with the elements in reverse order, so for example {1, 2, 3} becomes {3, 2, 1}. 
//
//
public class Reverse {
    
    public int[] reverse(int[] numbers) {
        for(int i = 0; i < numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        return numbers;
    }

}
