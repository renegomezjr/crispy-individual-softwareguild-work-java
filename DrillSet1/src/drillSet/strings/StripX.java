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
public class StripX {

    public String StripX(String str) {
        if (str.length() == 0) {
            return str;

        } else if (str.substring(0, 1).equals("x") && str.substring(str.length() - 1, str.length()).equals("x")) {
            return str.substring(1, str.length() - 1);

        } else if (str.substring(0, 1).equals("x")) {
            return str.substring(1);

        } else if (str.substring(str.length() - 1, str.length()).equals("x")) {
            return str.substring(0, str.length() - 1);

        } else {
            return str;
        }
    }
}
