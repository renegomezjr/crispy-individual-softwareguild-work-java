/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rene Gomez
 */
public class Fix23Test {

    Fix23 testObj = new Fix23();

    @Test
    public void fix23Test1() {
        int[] params = {1, 2, 3};
        int[] result = {1, 2, 0};
        Assert.assertArrayEquals(result, testObj.Fix23(params));

    }

    @Test
    public void fix23Test2() {
        int[] params = {2, 3, 5};
        int[] result = {2, 0, 5};
        Assert.assertArrayEquals(result, testObj.Fix23(params));

    }

    @Test
    public void fix23Test3() {
        
        int[] params = {1, 2, 1};
        int[] result = {1, 2, 1};
        Assert.assertArrayEquals(result, testObj.Fix23(params));

    }

}
