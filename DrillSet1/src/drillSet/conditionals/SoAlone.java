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
public class SoAlone {

    public boolean SoAlone(int a, int b) {
        if ((a <= 19 && a >= 13) && (b <= 19 && b >= 13)) {
            return false;
        } else if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13)) {
            return true;
        } else {
            return false;
        }
    }
}
