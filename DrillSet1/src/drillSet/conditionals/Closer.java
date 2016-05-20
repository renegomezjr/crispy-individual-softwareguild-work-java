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
public class Closer {

    public int Closer(int a, int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        } else if (Math.abs(10 - b) > Math.abs(10 - a)) {
            return a;
        } else {
            return 0;
        }
    }
}
