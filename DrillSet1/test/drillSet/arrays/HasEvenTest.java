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
public class HasEvenTest {

    HasEven testObj = new HasEven();

    @Test
    public void hasEvenTest1() {
        int[] arr = {2, 5};
        Assert.assertTrue(testObj.HasEven(arr));

    }

    @Test
    public void hasEvenTest2() {
        int[] arr = {4, 3};
        Assert.assertTrue(testObj.HasEven(arr));
    }

    @Test
    public void hasEvenTest3() {
        int[] arr = {7, 5};
        Assert.assertFalse(testObj.HasEven(arr));
    }
    
    @Test
    public void hasEvenTestBiggerArrayWithNegative(){
        int[] arr = {7, 5, 39, 41, -100};
        Assert.assertTrue(testObj.HasEven(arr));
    }

}
