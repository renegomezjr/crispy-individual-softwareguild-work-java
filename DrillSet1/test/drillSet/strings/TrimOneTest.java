/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
//Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2. 
//
//TrimOne("Hello") -> "ell"
//TrimOne("java") -> "av"
//TrimOne("coding") -> "odin"

public class TrimOneTest {
    TrimOne testObj = new TrimOne();
    
    public TrimOneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void trimOneTest(){
        Assert.assertEquals("ell", testObj.trimOne("Hello"));
    }
    
    @Test
    public void trimOneJavaTest(){
        Assert.assertEquals("av", testObj.trimOne("java"));
    }
    
    @Test
    public void trimOneCodingTest(){
        Assert.assertEquals("odin", testObj.trimOne("coding"));
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
