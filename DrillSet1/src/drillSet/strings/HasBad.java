/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

/**
 *
 * @author Rene Gomez
 */
public class HasBad {

    public boolean HasBad(String str) {

        for (int i = 0; i < str.length(); i++) {
            if ((i < 2) && str.substring(i, i + 1).equals("b")) {
                if ((i + 3) < str.length()) {
                    if (str.substring(i + 1, i + 3).equals("ad")) {
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
