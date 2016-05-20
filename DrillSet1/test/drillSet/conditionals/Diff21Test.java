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
public class Diff21Test {
    Diff21 testObj = new Diff21();
    
    @Test
    public void diff21Test1(){
        Assert.assertEquals(4, testObj.Diff21(23));
    }
    
    @Test
    public void diff21Test2(){
        Assert.assertEquals(11, testObj.Diff21(10));
    }
    
    @Test 
    public void diff21Test3(){
        Assert.assertEquals(0, testObj.Diff21(21));
    }
}
