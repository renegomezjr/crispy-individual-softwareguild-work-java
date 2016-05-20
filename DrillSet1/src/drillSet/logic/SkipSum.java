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
public class SkipSum {
//    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive are forbidden, so in that case just return 20. 

    public int SkipSum(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <=19){
            sum = 20;
            return sum;
        }
        return sum;
    }
}
