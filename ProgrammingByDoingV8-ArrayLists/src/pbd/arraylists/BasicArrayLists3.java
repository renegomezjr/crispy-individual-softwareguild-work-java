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
public class BasicArrayLists3 {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>(1000);
        Random r = new Random();
        System.out.print("[");
        for (int i = 0; i < 1000; i++) { 
            bigList.add(r.nextInt(90) + 10);
            System.out.print(bigList.get(i) + ", ");
            if (i % 10 == 0 && i > 0) {
                System.out.println("\n");
            }
        } 
    }
}
