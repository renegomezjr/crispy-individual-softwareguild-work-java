/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

/**
 *
 * @author Rene Gomez
 */
public class ConCat {

    public String ConCat(String a, String b) {
        if (a.equals("") || b.equals("")) {
            return a + b;
        } else if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1) + (b.substring(0));
        } else {
            return a + b;

        }
    }
}
