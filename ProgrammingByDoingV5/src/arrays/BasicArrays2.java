/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class BasicArrays2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
            System.out.println("Slot " + i + " contains a " + arr[i]);
        }
    }
}
