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
public class PosNegTest {
    PosNeg testObj = new PosNeg();
    
    @Test
    public void posNegTest1(){
        Assert.assertTrue(testObj.PosNeg(1, -1, false));
    }
    
    @Test
    public void posNegTest2(){
        Assert.assertTrue(testObj.PosNeg(-1, 1, false));
    }
    
    @Test
    public void posNegTest3(){
        Assert.assertTrue(testObj.PosNeg(-4, -5, true));
    }
    
    
    @Test
    public void posNegTest4(){
        Assert.assertFalse(testObj.PosNeg(0, 0, true));
    }
    
}
