/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

/**
 *
 * @author Rene Gomez
 */
public class MinCat {

    public String MinCat(String a, String b) {
        String temp1;

        if (a.length() > b.length()) {
            int num = a.length() - b.length();
            temp1 = a.substring(num, a.length());
            return temp1 + b;
        } else if (a.length() < b.length()) {
            int num = b.length() - a.length();
            temp1 = b.substring(num, b.length());
            return a + temp1;
        } else {
            return a + b;
        }
    }

}
