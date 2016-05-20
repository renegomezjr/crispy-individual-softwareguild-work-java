/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */

public class StringSplosionTest {
    StringSplosion testObj = new StringSplosion();
    
    @Test
    public void stringSplosionTest(){
        Assert.assertEquals("CCoCodCode", testObj.stringSplosion("Code")); 
    }
    
    @Test
    public void stringSplosionTest2(){
        Assert.assertEquals("aababc", testObj.stringSplosion("abc")); 
    }
    
    @Test
    public void stringSpolsionTest3(){
        Assert.assertEquals("aab", testObj.stringSplosion("ab")); 
    }
//    Given a non-empty string like "Code" return a string like "CCoCodCode".  (first char, first two, first 3, etc)
//
//StringSplosion("Code") -> "CCoCodCode"
//StringSplosion("abc") -> "aababc"
//StringSplosion("ab") -> "aab"
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
