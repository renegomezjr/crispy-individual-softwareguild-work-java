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
public class TakeTwoFromPosition {

    public String TakeTwoFromPosition(String str, int n) {
        String letters;

        if ((str.length() - n) < n) {
            return str.substring(0, 2);
        } else {
            return str.substring(n, n + 2);
        }
    }
}
