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
public class IxStart {

    public boolean IxStart(String str) {
        if (str.length() > 2 && str.substring(1, 3).equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
}
