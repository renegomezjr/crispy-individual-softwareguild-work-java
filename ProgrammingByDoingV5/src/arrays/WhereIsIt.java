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
public class WhereIsIt {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int value;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50) + 1;
            if (i == 0) {
                System.out.print("Array: ");
            }
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nValue to find: ");
        value = sc.nextInt();

        for (int i = 0; i < 10; i++) {

            if (arr[i] == value) {
                System.out.println(value + " was found at slot " + i);
                counter++;
            }

        }
        
        if (counter < 1) {
            System.out.println(value + " was not found in the array.");
        }
    }

}
