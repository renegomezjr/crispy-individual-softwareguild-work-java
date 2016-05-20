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
public class NotStringTest {
    NotString testObj = new NotString();
    
    @Test
    public void notStringTest1(){
        Assert.assertEquals("not candy", testObj.NotString("candy"));
    }
    
    @Test
    public void notStringTest2(){
        Assert.assertEquals("not x", testObj.NotString("x")); 
    }
    
    @Test
    public void notStringTest3(){
        Assert.assertEquals("not bad", testObj.NotString("not bad"));
    }
    
    
    
    
}
