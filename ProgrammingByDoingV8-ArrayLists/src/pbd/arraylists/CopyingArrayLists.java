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
public class CopyingArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(10);
        
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list1.add(r.nextInt(100) + 1);
        }
        
        ArrayList<Integer> list2 = new ArrayList<Integer>(list1);
        
        for (int k = 0; k < 10; k++) {
            if (k == 0) {
                System.out.print("ArrayList 1: ");
            }
            if (k == 9) {
                list1.set(k, -7);
            }

            System.out.print(list1.get(k) + " ");

            if (k % 9 == 0 && k> 0) {
                System.out.println("\n");
            }
        }
        
        for (int l = 0; l < 10; l++) {
            if (l == 0) {
                System.out.print("ArrayList 2: ");
            }
            System.out.print(list2.get(l) + " ");
        }
    }
}
