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
public class InRange {
//    Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

    public boolean InRange(int n, boolean outsideMode) {

        if ((n >= 1 && n <= 10) && !outsideMode) {
            return true;
        } else if (!(n >= 1 && n <= 10) && outsideMode) {
            return true;
        } else {

            return false;
        }

    }

}
