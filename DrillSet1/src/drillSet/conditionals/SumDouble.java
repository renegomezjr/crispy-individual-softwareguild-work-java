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
public class SumDouble {
// Given two int values, return their sum. However, if the two values are the same, then return double their sum.

    public int SumDouble(int a, int b) {
        
        if(a == b){
            return (a + b)*2;
        }else{
            return a + b;
        }
    }
}
