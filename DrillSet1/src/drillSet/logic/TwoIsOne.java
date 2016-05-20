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
public class TwoIsOne {

    public boolean TwoIsOne(int a, int b, int c) {
        if (a + b == c || c + b == a || c + a == b) {
            return true;
        } else {
            return false;
        }
    }
}
