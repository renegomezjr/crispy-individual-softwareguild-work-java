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
public class FrontAndBackTest {
    FrontAndBack testObj = new FrontAndBack();
    
    @Test
    public void frontAndBackTest1(){
        Assert.assertEquals("Helo", testObj.FrontAndBack("Hello", 2)); 
    }
    
    @Test
    public void frontAndBackTest2(){
        Assert.assertEquals("Choate", testObj.FrontAndBack("Chocolate", 3));
    }
    
    @Test
    public void frontAndBackTest3(){
        Assert.assertEquals("Ce", testObj.FrontAndBack("Chocolate", 1)); 
    }
}
