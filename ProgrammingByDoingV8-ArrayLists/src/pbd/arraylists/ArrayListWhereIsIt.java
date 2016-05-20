/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class ArrayListWhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(20);
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        int value;
        
        for (int i = 0; i < 20; i++) {
            arrList.add(r.nextInt(51) + 1);
        }
        System.out.println("ArrayList: " + arrList);
        
        System.out.print("\nValue to find: ");
        value = sc.nextInt();
        
        int counter = 0;
        for (int i = 0; i < 20; i++) {
            if (arrList.get(i) == value){
                System.out.println(value + " is in slot " + i);
                counter++;
            }
        }
        
        if (counter == 0){
            System.out.println(value + " is not in the ArrayList.");
        }
    }
}
