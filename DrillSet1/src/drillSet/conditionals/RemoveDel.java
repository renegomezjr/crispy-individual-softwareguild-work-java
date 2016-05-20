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
public class RemoveDel {

    public String RemoveDel(String str) {
        if (str.charAt(1) == 'd' && str.length() > 3 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4, str.length());
        } else {
            return str;
        }
    }
}
