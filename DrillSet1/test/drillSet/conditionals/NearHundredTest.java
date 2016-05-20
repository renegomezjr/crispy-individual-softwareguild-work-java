/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class NearHundredTest {

    NearHundred testObj = new NearHundred();

    @Test
    public void nearHundredTest1() {
        Assert.assertTrue(testObj.NearHundred(103));
    }

    @Test
    public void nearHundredTest2() {
        Assert.assertTrue(testObj.NearHundred(90));

    }

    @Test
    public void nearHundredTest3() {
        Assert.assertFalse(testObj.NearHundred(89));
    }

    @Test
    public void nearHundredTest4() {
        Assert.assertTrue(testObj.NearHundred(210));
    }

    @Test
    public void nearHundredTest5() {
        Assert.assertTrue(testObj.NearHundred(110));
    }

}
