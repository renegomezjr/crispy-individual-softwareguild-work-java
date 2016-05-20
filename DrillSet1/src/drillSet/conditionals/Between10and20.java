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
public class Between10and20 {

    public boolean Between10and20(int a, int b) {
        
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        } else {
            return false;
        }
        
    }

}
