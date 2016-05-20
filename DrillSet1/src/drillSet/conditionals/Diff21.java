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
public class Diff21 {
//    Given an int n, return the absolute value of the difference between n and 21, except return double the absolute value of the difference if n is over 21. 

    public int Diff21(int n) {
        int diff = n - 21;
        int abs = Math.abs(diff);
        if(n > 21){
            return abs * 2;
        } else {
            return abs;
        }
    }
}
