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
public class Unlucky1Test {

    Unlucky1 testObj = new Unlucky1();

    @Test
    public void unluck1Test1() {
        int[] arr = {1, 3, 4, 5};
        Assert.assertTrue(testObj.Unlucky1(arr));

    }

    @Test
    public void unluck1Test2() {
        int[] arr = {2, 1, 3, 4, 5};
        Assert.assertTrue(testObj.Unlucky1(arr));

    }

    @Test
    public void unluck1Test3() {
        int[] arr = {1, 1, 1};
        Assert.assertFalse(testObj.Unlucky1(arr));

    }
    
    @Test
    public void unluck1Test4LastPosition() {
        int[] arr = {1, 1, 1, 1, 3};
        Assert.assertTrue(testObj.Unlucky1(arr));

    }
}
