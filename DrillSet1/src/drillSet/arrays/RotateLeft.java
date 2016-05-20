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
//Given an array of ints, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}. 
//
//RotateLeft({1, 2, 3}) -> {2, 3, 1}
//RotateLeft({5, 11, 9}) -> {11, 9, 5}
//RotateLeft({7, 0, 0}) -> {0, 0, 7}
public class RotateLeft {
            
    public int[] rotateLeft(int[] numbers) {
        int[] arr = new int[numbers.length];
        for(int i = 0; i < numbers.length-1; i++){
            arr[i] = numbers[i+1];
        }
        arr[numbers.length-1] = numbers[0];
        return arr;
    }
}
