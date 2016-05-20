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
public class BackAroundTest {
    BackAround testObj = new BackAround();
    
    @Test
    public void backAroundTest1(){
        Assert.assertEquals("tcatt", testObj.BackAround("cat")); 
    }
    
    @Test
    public void backAroundTest2(){
        Assert.assertEquals("oHelloo", testObj.BackAround("Hello"));
    }
    
    @Test
    public void backAroundTest3(){
        Assert.assertEquals("aaa", testObj.BackAround("a")); 
    }
}
