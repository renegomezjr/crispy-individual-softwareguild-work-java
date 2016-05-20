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
public class KeepLastTest {

    KeepLast testObj = new KeepLast();

    @Test
    public void keepLast() {
        int[] param = {4, 5, 6};
        int[] ans = {0, 0, 0, 0, 0, 6};
        Assert.assertArrayEquals(ans, testObj.KeepLast(param));

    }

    @Test
    public void keepLast2() {
        int[] param = {1, 2};
        int[] ans = {0, 0, 0, 2};
        Assert.assertArrayEquals(ans, testObj.KeepLast(param));

    }

    @Test
    public void keepLast3() {
        int[] param = {3};
        int[] ans = {0, 3};
        Assert.assertArrayEquals(ans, testObj.KeepLast(param));

    }
    
    @Test
    public void keepLastArrayWithEnd0() {
        int[] param = {3,0,5,6,0};
        int[] ans = {0,0,0,0,0,0,0,0,0,0};
        Assert.assertArrayEquals(ans, testObj.KeepLast(param));

    }
}
