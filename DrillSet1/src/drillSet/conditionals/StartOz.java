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
public class StartOz {

    public String StartOz(String str) {
        String newOz = "";
        if (str.length() > 1 && (str.charAt(0) == 'o' || str.charAt(1) == 'z')) {
            if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
                newOz += str.substring(0, 2);
                return newOz;
            } else if (str.charAt(0) == 'o') {
                newOz += str.charAt(0);
                return newOz;
            } else {
                newOz += str.charAt(1);
                return newOz;
            }
        } else {
            return "";
        }
    }
}
