/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class HasBadTest {

    HasBad testObj = new HasBad();

    @Test
    public void hasBadTest1() {
        Assert.assertTrue(testObj.HasBad("badxx"));
    }

    @Test
    public void hasBadTest2() {
        Assert.assertTrue(testObj.HasBad("xbadxx"));
    }

    @Test
    public void hasBadTest3() {
        Assert.assertFalse(testObj.HasBad("xxbadxx"));
    }
    
    @Test
    public void hasBadTest4SomeLetters() {
        Assert.assertFalse(testObj.HasBad("xba"));
    }
}
