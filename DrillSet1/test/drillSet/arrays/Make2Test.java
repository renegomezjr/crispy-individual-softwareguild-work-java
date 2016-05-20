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
public class Make2Test {

    Make2 testObj = new Make2();

    @Test
    public void make2Test1() {
        int[] param1 = {4, 5};
        int[] param2 = {1, 2, 3};
        int[] result = {4, 5};
        Assert.assertArrayEquals(result, testObj.make2(param1, param2));

    }

    @Test
    public void make2Test2() {

        int[] param1 = {4};
        int[] param2 = {1, 2, 3};
        int[] result = {4, 1};
        Assert.assertArrayEquals(result, testObj.make2(param1, param2));

    }

    @Test
    public void make2Test3() {
        int[] param1 = {};
        int[] param2 = {1, 2};
        int[] result = {1, 2};
        Assert.assertArrayEquals(result, testObj.make2(param1, param2));

    }
    @Test
    public void make2Test4ArrayWith1Each() {
        int[] param1 = {1};
        int[] param2 = {2};
        int[] result = {1, 2};
        Assert.assertArrayEquals(result, testObj.make2(param1, param2));

    }

}
