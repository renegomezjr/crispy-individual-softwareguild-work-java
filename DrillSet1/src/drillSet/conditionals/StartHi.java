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
public class StartHi {

    public boolean StartHi(String str) {
        if (str.substring(0, 2).equals("hi") && str.length() < 3) {
            return true;
        } else if (str.length() >= 3 && str.substring(0, 2).equals("hi") && str.substring(2, 3).equals(" ")) {
            return true;
        } else {
            return false;
        }

    }

}
