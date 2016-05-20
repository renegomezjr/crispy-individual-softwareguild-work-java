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
public class SpecialEleven {

    public boolean SpecialEleven(int n) {
        
        if(n % 11 == 0 || n % 11 == 1){
            return true;
        }
        
        return false;
    }

}
