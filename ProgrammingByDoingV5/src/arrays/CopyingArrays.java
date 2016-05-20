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
public class CopyingArrays {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = arr[j];
        }
        
        for (int k = 0; k < arr.length; k++) {
            if (k == 0) {
                System.out.print("Array 1: ");
            }
            if (k == 9) {
                arr[k] = -7;
            }

            System.out.print(arr[k] + " ");

            if (k % 9 == 0 && k> 0) {
                System.out.println("\n");
            }
        }
        
        for (int l = 0; l < 10; l++) {
            if (l == 0) {
                System.out.print("Array 2: ");
            }
            System.out.print(arr2[l] + " ");
        }
    }
}
