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
public class BasicArrays3 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random r = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(90) + 10;
            System.out.print(arr[i] + "  ");
            if (i % 10 == 0 && i > 0){
                System.out.println("\n");
            }
        }
    }
}
