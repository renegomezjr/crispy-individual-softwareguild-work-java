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
public class AtFirstTest {
    AtFirst testObj = new AtFirst();
    
    @Test
    public void atFirstTest(){
        Assert.assertEquals("he", testObj.AtFirst("hello")); 
    }
    
    @Test
    public void atFirstTest2(){
        Assert.assertEquals("hi", testObj.AtFirst("hi"));
    }
    
    @Test
    public void atFirstTest3(){
        Assert.assertEquals("h@", testObj.AtFirst("h"));
    }
}
