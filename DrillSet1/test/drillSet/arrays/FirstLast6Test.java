/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class FirstLast6Test {
    FirstLast6 testObj = new FirstLast6();
//FirstLast6({1, 2, 6}) -> true
//FirstLast6({6, 1, 2, 3}) -> true
//FirstLast6({13, 6, 1, 2, 3}) -> false
    
    @Test
    public void FirstLast6(){
        int[] testArr = {1, 2, 6};
        Assert.assertTrue(testObj.FirstLast6(testArr));
    }
    
    @Test
    public void FirstLast6TestwithFourNumbers(){
        int[] testArr = {6, 1, 2, 3};
        Assert.assertTrue(testObj.FirstLast6(testArr));
    }
    
    @Test
    public void FirstLast6TestwithFiveNumbers(){
        int[] testArr = {13, 6, 1, 2, 3};
        Assert.assertFalse(testObj.FirstLast6(testArr));
    }
    
    @Test
    public void FirstLast6TestwithOne(){
        int[] testArr = {6};
        Assert.assertTrue(testObj.FirstLast6(testArr));
    }
}
