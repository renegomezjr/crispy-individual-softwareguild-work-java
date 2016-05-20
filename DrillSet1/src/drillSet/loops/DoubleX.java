/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

/**
 *
 * @author Rene Gomez
 */
public class DoubleX {

    public boolean doubleX(String str) {
        boolean yep = false;
        String xx = "xx";
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == xx.charAt(0) && str.charAt(i+1)== xx.charAt(1)){
                return true;
            }
        }
        return false;
    }
}
