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
public class LoveSix {
//    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6.

    public boolean LoveSix(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        if (sum == 6 || diff == 6 || a == 6 || b == 6) {
            return true;
        } else {
            return false;
        }

    }
}
