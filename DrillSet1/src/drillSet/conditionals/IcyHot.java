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
public class IcyHot {

    public boolean IcyHot(int temp1, int temp2) {
        if ((temp1 > 100 && 0 > temp2) || (temp2 > 100 && 0 > temp1)) {
            return true;
        }else{
            return false;
        }
    }
}
