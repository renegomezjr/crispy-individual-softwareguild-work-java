/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmups.interation;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rene Gomez
 */
public class iteration {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Vikings");
        list.add("Packers");
        list.add("Lions");
        list.add("Bears");
        list.add("Browns");
        list.add("Bengals");
        list.add("Steelers");
        list.add("Ravens");

        for (String t : list) {
            System.out.println(t);
        }

        //iterator
        System.out.println("\n");
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            String current = iter.next();
            System.out.println(current);
        }
        
        System.out.println("\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
