/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.arraylists;

import java.util.ArrayList;

/**
 *
 * @author Rene Gomez
 */
public class BasicArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            list.add(-113);
            System.out.println("Slot " + i + " contains a " + list.get(i));
        }
    }
    
}
