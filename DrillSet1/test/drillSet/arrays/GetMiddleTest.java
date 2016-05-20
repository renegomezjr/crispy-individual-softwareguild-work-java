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
public class GetMiddleTest {

    GetMiddle testObj = new GetMiddle();

    @Test
    public void getMiddleTest1() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] ans = {2, 5};
        Assert.assertArrayEquals(ans, testObj.GetMiddle(arr1, arr2));
    }

    @Test
    public void getMiddleTest2() {
        int[] arr1 = {7, 7, 7}; 
        int[] arr2 = {3, 8, 0};
        int[] ans = {7, 8};
        Assert.assertArrayEquals(ans, testObj.GetMiddle(arr1, arr2));
    }

    @Test
    public void getMiddleTest3() {
        int[] arr1 = {5, 2, 9};
        int[] arr2 = {1, 4, 5};
        int[] ans = {2, 4};
        Assert.assertArrayEquals(ans, testObj.GetMiddle(arr1, arr2));
    }

}
