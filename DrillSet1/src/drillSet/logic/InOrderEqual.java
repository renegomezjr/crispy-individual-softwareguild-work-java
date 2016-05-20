/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

/**
 *
 * @author Rene Gomez
 */
public class InOrderEqual {

    public boolean InOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a < b && b < c) {
            return true;
        } else if (a <= b && b <= c && equalOk) {
            return true;
        } else {
            return false;
        }
    }

}
