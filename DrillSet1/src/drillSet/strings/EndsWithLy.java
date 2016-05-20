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
public class EndsWithLy {

    public boolean EndsWithLy(String str) {
        String[] arr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            if (arr[i].equals("l") && arr[i+1].equals("y")) {
                return true;
            }
        }
        return false;
    }

}
