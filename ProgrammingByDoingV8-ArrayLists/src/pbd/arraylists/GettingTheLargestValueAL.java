/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class GettingTheLargestValueAL {

    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.print("[");
        for (int i = 0; i < r.nextInt(100); i++) {
            arrList.add(r.nextInt(100));
            System.out.print(arrList.get(i) + ", ");
        }
        System.out.print("]");

        int largestNum = 0;
        for (int n : arrList) {
            if (n > largestNum) {
                largestNum = n;
            }
        }
        System.out.println("\nThe largest number is " + largestNum);
    }

}
