/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class InRangeTest {
    InRange testObj = new InRange();
    
    @Test
    public void inRangeTest1(){
        Assert.assertTrue(testObj.InRange(5, false));
    }
    
    @Test
    public void inRangeTest2(){
        Assert.assertFalse(testObj.InRange(11, false));
    }
    
    @Test
    public void inRangeTest3(){
        Assert.assertTrue(testObj.InRange(11, true));
    }
}
