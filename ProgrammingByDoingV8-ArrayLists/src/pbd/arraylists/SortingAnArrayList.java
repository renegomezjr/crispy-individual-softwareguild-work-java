/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class SortingAnArrayList {

    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.print("before sort: [");
        for (int i = 0; i < r.nextInt(100); i++) {
            arrList.add(r.nextInt(99) + 10);
            System.out.print(arrList.get(i) + ", ");
        }
        System.out.print("]");
        
        Collections.reverse(arrList);

        System.out.print("\nafter sort: [");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + ", ");
        }
        System.out.print("]");

    }
}
