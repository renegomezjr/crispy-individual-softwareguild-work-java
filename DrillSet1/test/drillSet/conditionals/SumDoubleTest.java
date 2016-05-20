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
public class SumDoubleTest {
    SumDouble testObj = new SumDouble();
    
    @Test
    public void sumDoubleTest1(){
        Assert.assertEquals(3, testObj.SumDouble(1, 2));
    }
    
    @Test
    public void sumDoubleTest2(){
        Assert.assertEquals(5, testObj.SumDouble(3, 2));
    }
    
    @Test
    public void sumDoubleTest3(){
        Assert.assertEquals(8, testObj.SumDouble(2, 2));
    }

}
