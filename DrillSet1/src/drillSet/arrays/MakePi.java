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
public class MakePi {
//Return an int array length n containing the first n digits of pi.
//
//MakePi(3) -> {3, 1, 4}

    public int[] makePi(int n) {
        int[] pi = {3,1,4,1,5,9,2,6,5};
        int[] arrReturn = new int[n];
        
        if(n <= pi.length){
            for (int i = 0; i < n; i++) {
                arrReturn[i] = pi[i]; 
            }
            return arrReturn;
        } else {
            System.out.println("This is it. Look up the rest.");
            return pi;
        }
    }
}
