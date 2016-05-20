/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class SortingAnArrayListOfStrings {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("ask");
        arrList.add("not");
        arrList.add("what");
        arrList.add("your");
        arrList.add("country");
        arrList.add("can");
        arrList.add("do");
        arrList.add("for");
        arrList.add("you");
        arrList.add("but");

        System.out.print("\nArrayList before: [");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + ", ");
        }
        System.out.print("]");
        
        Collections.sort(arrList);

        System.out.print("\nArrayList after: [");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + ", ");
        }
        System.out.print("]");

    }
}
