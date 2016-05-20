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
public class SameFirstLastTest {
    SameFirstLast testObj = new SameFirstLast();
//    Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal. 
//
//SameFirstLast({1, 2, 3}) -> false
//SameFirstLast({1, 2, 3, 1}) -> true
//SameFirstLast({1, 2, 1}) -> true
    
    @Test
    public void sameFirstLastTestWithThree(){
        int[] testArr = {1, 2, 3};
        Assert.assertFalse(testObj.sameFirstLast(testArr));
    }
    
    @Test
    public void sameFirstLastTestWithFour(){
        int[] testArr = {1, 2, 3, 1};
        Assert.assertTrue(testObj.sameFirstLast(testArr));
    }
    
    @Test
    public void sameFirstLastTest(){
        int[] testArr = {1, 2, 1};
        Assert.assertTrue(testObj.sameFirstLast(testArr));
    }
    
    @Test
    public void sameFirstLastTestWith1(){
        int[] testArr = {1};
        Assert.assertFalse(testObj.sameFirstLast(testArr));
    }
}
