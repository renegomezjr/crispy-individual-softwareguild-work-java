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
public class GotE {

    public boolean GotE(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                counter++;
            }
        }
        
        if (counter >= 1 && counter <= 3) {
            return true;
        } else {
            return false;
        }
    }
}
