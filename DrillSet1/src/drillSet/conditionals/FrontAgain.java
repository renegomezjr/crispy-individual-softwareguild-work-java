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
public class FrontAgain {

    public boolean FrontAgain(String str) {
        if (str.length() < 3) {
            return true;
        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return true;
        } else {
            return false;
        }
    }
}
