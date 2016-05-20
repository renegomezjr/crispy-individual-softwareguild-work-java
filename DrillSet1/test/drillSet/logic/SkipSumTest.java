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
public class SkipSumTest {
    SkipSum testObj = new SkipSum();
    
    @Test
    public void SkipSumTest(){
    
        Assert.assertEquals(7, testObj.SkipSum(3, 4));
    }
    
    @Test
    public void SkipSumTest2(){
        Assert.assertEquals(20, testObj.SkipSum(9, 4));
    }
    
    @Test
    public void SkipSumTest3(){
        Assert.assertEquals(21, testObj.SkipSum(10, 11));
    }
    
    
}
