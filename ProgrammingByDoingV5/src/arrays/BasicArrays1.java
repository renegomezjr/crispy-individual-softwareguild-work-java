/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Rene Gomez
 */
public class BasicArrays1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -113;
            System.out.println("Slot " + i + " contains a " + arr[i]);
        }
    }
    
}
