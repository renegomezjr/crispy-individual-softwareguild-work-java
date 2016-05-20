/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rene Gomez
 */
public class FindingValueArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(10);
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        int value;
        
        for (int i = 0; i < 10; i++) {
            arrList.add(r.nextInt(51) + 1);
        }
        System.out.println("ArrayList: " + arrList);
        
        System.out.print("\nValue to find: ");
        value = sc.nextInt();
        
        for (int num : arrList) {
            if (num == value){
                System.out.println(num + " is in the ArrayList!");
            }
        }
        
    }
}
