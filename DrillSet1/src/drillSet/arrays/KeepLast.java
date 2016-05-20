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
public class KeepLast {
//    Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

    public int[] KeepLast(int[] numbers) {
        
        int[] arr = new int[numbers.length*2];
        arr[arr.length-1] = numbers[numbers.length-1];
        
        return arr;
        
    }
}
