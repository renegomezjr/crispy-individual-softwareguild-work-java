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
public class FrontBackTest {

    FrontBack testObj = new FrontBack();

    @Test
    public void frontBackTest1() {
        Assert.assertEquals("eodc", testObj.FrontBack("code"));
    }

    @Test
    public void frontBackTest2() {
        Assert.assertEquals("a", testObj.FrontBack("a"));
    }

    @Test
    public void frontBackTest3() {
        Assert.assertEquals("ba", testObj.FrontBack("ab"));

    }
}
