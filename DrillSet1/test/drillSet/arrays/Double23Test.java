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
public class Double23Test {

    Double23 testObj = new Double23();

    @Test
    public void double23Test1() {
        int[] arr = {2, 2, 3};
        Assert.assertTrue(testObj.Double23(arr));
    }

    @Test
    public void double23Test2() {
        int[] arr = {3, 4, 5, 3};
        Assert.assertTrue(testObj.Double23(arr));
    }

    @Test
    public void double23Test3() {
        int[] arr = {2, 3, 2, 2};
        Assert.assertFalse(testObj.Double23(arr));
    }
    
}
