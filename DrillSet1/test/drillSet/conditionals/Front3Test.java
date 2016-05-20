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
public class Front3Test {

    Front3 testObj = new Front3();

    @Test
    public void front3Test1() {
        Assert.assertEquals("MicMicMic", testObj.Front3("Microsoft"));
    }

    @Test
    public void front3Test2() {
        Assert.assertEquals("ChoChoCho", testObj.Front3("Chocolate"));
    }

    @Test
    public void front3Test3() {
        Assert.assertEquals("atatat", testObj.Front3("at"));
    }
}
