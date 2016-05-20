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
public class ParrotTrouble {
//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble. 

    public boolean ParrotTrouble(boolean isTalking, int hour) {
        
        if((hour < 7 || hour > 20) && isTalking){
            return true;
        } else {
            return false;
        }
    }
}
