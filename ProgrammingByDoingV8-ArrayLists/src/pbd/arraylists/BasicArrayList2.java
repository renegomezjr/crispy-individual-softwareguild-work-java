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
public class BasicArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(10);
        Random r = new Random();
        int value;
        
        for (int i = 0; i < 10; i++) {
            ints.add(r.nextInt(100)+1);
        }
        
        System.out.println("ArrayList: " + ints);
    }
    
}
