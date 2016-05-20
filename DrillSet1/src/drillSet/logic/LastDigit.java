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
public class LastDigit {

    public boolean LastDigit(int a, int b, int c) {
        String aInt = "";
        aInt += a;
        String bInt = "";
        bInt += b;
        String cInt = "";
        cInt += c;

        if ((aInt.charAt(aInt.length() - 1)) == (bInt.charAt(bInt.length() - 1))) {
            return true;
        } else if ((aInt.charAt(aInt.length() - 1)) == (cInt.charAt(cInt.length() - 1))) {
            return true;
        } else if ((bInt.charAt(bInt.length() - 1)) == (cInt.charAt(cInt.length() - 1))) {
            return true;
        } else {
            return false;
        }
    }
}
