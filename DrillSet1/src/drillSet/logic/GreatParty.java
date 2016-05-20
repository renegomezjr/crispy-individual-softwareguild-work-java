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
public class GreatParty {

    public boolean GreatParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 && !isWeekend) {
            return true;
        } else if (isWeekend && cigars >= 60) {
            return true;
        } else {
            return false;
        }
    }
}
