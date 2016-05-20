/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

/**
 *
 * @author Rene Gomez
 */
public class CountLast2 {

    public int countLast2(String str) {
        int count = 0;
        String xx = str.substring(str.length()-2, str.length());
        for (int i = 0; i < str.length()-2; i++) {
            String compare = str.substring(i, i+2);
            if (compare.equalsIgnoreCase(xx)) {
                count++;
            }
        }
        return count;
    }
}
