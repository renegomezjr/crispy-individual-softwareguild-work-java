/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class CaughtSpeedingTest {
    CaughtSpeeding testObj = new CaughtSpeeding();
    
    @Test
    public void CaughtSpeedingTest1(){
        Assert.assertEquals(0, testObj.CaughtSpeeding(60, false));
    }
    
    
    @Test
    public void CaughtSpeedingTest2(){
        Assert.assertEquals(1, testObj.CaughtSpeeding(65, false));
    }
    
    @Test
    public void CaughtSpeedingTest3(){
        Assert.assertEquals(0, testObj.CaughtSpeeding(65, true));
    }
}
