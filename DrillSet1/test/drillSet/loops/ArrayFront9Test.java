/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */

public class ArrayFront9Test {
//    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
    ArrayFront9 testObj = new ArrayFront9();
    
    @Test
    public void ArrayFront9Test1(){
        int[] arr = {1, 2, 9, 3, 4};
        Assert.assertTrue(testObj.ArrayFront9(arr));
    }
    
    @Test
    public void ArrayFront9Test2(){
        int[] arr = {1, 2, 3, 4, 9};
        Assert.assertFalse(testObj.ArrayFront9(arr));
    }
    
    @Test
    public void ArrayFront9Test3(){
        int[] arr = {1, 2, 3, 4, 5};
        Assert.assertFalse(testObj.ArrayFront9(arr));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
