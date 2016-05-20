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
public class MischieviousChildren {
//    We have two children, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 

    public boolean AreWeInTrouble(boolean aSmile, boolean bSmile) {
        if((!aSmile && !bSmile)||(aSmile && bSmile)){
            return true;
        }else {
            return false;
        }
    }
    
}
