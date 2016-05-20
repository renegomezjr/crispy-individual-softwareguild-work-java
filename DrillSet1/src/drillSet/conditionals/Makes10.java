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
public class Makes10 {
//    Given two ints, a and b, return true if one if them is 10 or if their sum is 10.
    
    public boolean Makes10(int a, int b) {
        int sum = a + b;
        if((a == 10 || b == 10) || (sum == 10)){
            return true;
        } else {
            return false;
        }
    }
}
