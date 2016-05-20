/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class Multiple3or5Test {

    Multiple3or5 testObj = new Multiple3or5();

    @Test
    public void multiple3or5Test1() {
        Assert.assertTrue(testObj.Multiple3or5(3));
    }

    @Test
    public void multiple3or5Test2() {
        Assert.assertTrue(testObj.Multiple3or5(10));
    }

    @Test
    public void multiple3or5Test3() {
        Assert.assertFalse(testObj.Multiple3or5(8));
    }
}
