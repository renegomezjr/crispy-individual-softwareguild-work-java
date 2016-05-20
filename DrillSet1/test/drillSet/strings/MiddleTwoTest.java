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
//Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2. 
//
//MiddleTwo("string") -> "ri"
//MiddleTwo("code") -> "od"
//MiddleTwo("Practice") -> "ct"

public class MiddleTwoTest {
    MiddleTwo testObj = new MiddleTwo();
    
    public MiddleTwoTest() {
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
    public void middleTwoTest(){
        
        Assert.assertEquals("ri", testObj.middleTwo("string"));
        
    }
    
    @Test
    public void middleTwoCodeTest(){
        
        Assert.assertEquals("od", testObj.middleTwo("code"));
        
    }
    
    @Test
    public void middleTwoPracticeTest(){
        
        Assert.assertEquals("ct", testObj.middleTwo("Practice"));
        
    }
    
    @Test
    public void middleTwoBigNonsenseTest(){
        
        Assert.assertEquals("is", testObj.middleTwo("sjfueufidisodufueueu"));
        
    }
    
    @Test
    public void middleFalseTest(){
        
        Assert.assertNotEquals("j", testObj.middleTwo("sjf"));
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
