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
public class GivingAnArrayABunchValues {

    public static void main(String[] args) {
        String[] arr1 = {"alpha", "bravo", "charlie", "delta", "echo"};

        System.out.print("The first array is filled with the following values:\n\t");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        int[] arr2 = {1, 3, 5, 9, 2};

        System.out.print("\nThe second array is filled with the following values:\n\t");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }
}
