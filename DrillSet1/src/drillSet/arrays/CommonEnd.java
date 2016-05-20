/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.arrays;

/**
 *
 * @author Rene Gomez
 */
public class CommonEnd {
//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more. 
//
//CommonEnd({1, 2, 3}, {7, 3}) -> true
//CommonEnd({1, 2, 3}, {7, 3, 2}) -> false
//CommonEnd({1, 2, 3}, {1, 3}) -> true

    public boolean commonEnd(int[] a, int[] b) {
        if(a[0] == b[0]){
            return true;
        }else if (a[a.length-1] == b[b.length-1]){
            return true;
        }else{
            return false;
        }
    }
    
}
