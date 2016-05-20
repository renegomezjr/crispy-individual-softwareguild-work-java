/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
*/
//Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front; 
//
//FrontTimes("Chocolate", 2) -> "ChoCho"
//FrontTimes("Chocolate", 3) -> "ChoChoCho"
//FrontTimes("Abc", 3) -> "AbcAbcAbc"


public class FrontTimesTest {
    FrontTimes testObj = new FrontTimes();
    
    public FrontTimesTest() {
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
    public void frontTimesCho2(){
        Assert.assertEquals("ChoCho", testObj.frontTimes("Chocolate", 2));
    }
    
    @Test
    public void frontTimesCho3(){
        Assert.assertEquals("ChoChoCho", testObj.frontTimes("Chocolate", 3));
    }
    
    @Test
    public void frontTimesAbc3(){
        Assert.assertEquals("AbcAbcAbc", testObj.frontTimes("Abc", 3));
    }
//FrontTimes("Chocolate", 3) -> "ChoChoCho"
//FrontTimes("Abc", 3) -> "AbcAbcAbc"

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
