/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

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
//Given a string and a non-negative int n, return a larger string that is n copies of the original string. 
//
//StringTimes("Hi", 2) -> "HiHi"
//StringTimes("Hi", 3) -> "HiHiHi"
//StringTimes("Hi", 1) -> "Hi"

public class StringTimesTest {
    StringTimes testObj = new StringTimes();
    
    public StringTimesTest() {
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
    public void stringTimesTest2Hi(){
        Assert.assertEquals("HiHi", testObj.stringTimes("Hi", 2));
    }
    
    @Test
    public void stringTimesTest3Hi(){
        Assert.assertEquals("HiHiHi", testObj.stringTimes("Hi", 3));
    }
    
    @Test
    public void stringTimesTest1Hi(){
        Assert.assertEquals("Hi", testObj.stringTimes("Hi", 1));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
