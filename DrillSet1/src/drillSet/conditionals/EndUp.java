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
public class EndUp {

    public String EndUp(String str) {
        if (str.length() > 2) {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
        } else {
            return str.substring(0).toUpperCase();
        }
    }
}
