/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2. 
//
//MultipleEndings("Hello") -> "lololo"
//MultipleEndings("ab") -> "ababab"
//MultipleEndings("Hi") -> "HiHiHi"

public class MultipleEndingsTest {
    MultipleEndings testObj = new MultipleEndings();
    
    @Test
    public void multipleEndingsTest(){
        
        Assert.assertEquals("lololo", testObj.multipleEndings("Hello"));
    }
    
    @Test
    public void multipleEndingsAbTest(){
        
        Assert.assertEquals("ababab", testObj.multipleEndings("ab"));
    }
    
    @Test
    public void multipleEndingsHiTest(){
        Assert.assertEquals("HiHiHi", testObj.multipleEndings("Hi"));
    }
}
