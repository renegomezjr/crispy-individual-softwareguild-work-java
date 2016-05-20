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
public class Mod20 {

    public boolean Mod20(int n) {
        if (n % 20 == 1 || n % 20 == 2) {
            return true;
        } else {
            return false;
        }
    }
}
