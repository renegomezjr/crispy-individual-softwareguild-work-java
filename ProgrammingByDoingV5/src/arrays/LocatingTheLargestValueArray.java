/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class LocatingTheLargestValueArray {
    
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            if (i == 0) {
                System.out.print("Array: ");
            }
            System.out.print(arr[i] + " ");
        }

        
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > value) {
               value = arr[i];
               j = i;
            }

        }
        System.out.println("\nThe largest number is " + value
                + "\nIt was found at slot " + j);
      
    }

}
