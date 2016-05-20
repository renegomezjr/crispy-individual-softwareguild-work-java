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
//Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0). 
//
//LongInMiddle("Hello", "hi") -> "hiHellohi"
//LongInMiddle("hi", "Hello") -> "hiHellohi"
//LongInMiddle("aaa", "b") -> "baaab"

public class LongInMiddleTest {
    LongInMiddle testObj = new LongInMiddle();
    
    public LongInMiddleTest() {
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
    public void longInMiddleTest(){
        Assert.assertEquals("hiHellohi", testObj.longInMiddle("Hello", "hi"));
    }
    
    @Test
    public void longInMiddleHelloTest(){
        Assert.assertEquals("hiHellohi", testObj.longInMiddle("hi", "Hello"));
    }
    
    @Test
    public void longInMiddleHiTest(){
        Assert.assertEquals("baaab", testObj.longInMiddle("aaa", "b"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
