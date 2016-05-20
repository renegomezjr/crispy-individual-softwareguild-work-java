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
public class NearHundred {
//    Given an int n, return true if it is within 10 of 100 or 200.
//Hint: Check out the C# Math class for absolute value

    public boolean NearHundred(int n) {
        
        if( (110 >= n && n >= 90) || (210 >= n && 190 <= n) ){
            return true;
        } else {
            return false;
        }
    }
}
