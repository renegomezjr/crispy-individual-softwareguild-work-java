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
public class Mod35 {

    public boolean Mod35(int n) {
        
        if (n % 15 == 0) {
            return false;
        } else if (n % 3 == 0 || n % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
