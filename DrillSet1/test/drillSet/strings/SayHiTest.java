/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

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
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". 
//
//SayHi("Bob") -> "Hello Bob!"
//SayHi("Alice") -> "Hello Alice!"
//SayHi("X") -> "Hello X!"
public class SayHiTest {
    SayHi testObj = new SayHi();
    
    public SayHiTest() {
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
    public void sayHiTest(){
        String testResults = "Hello Bob!";
        String params = "Bob";
        Assert.assertEquals(testResults, testObj.sayHi(params));
    }
    
    @Test
    public void sayHiAliceTest(){
        String testResults = "Hello Alice!";
        String params = "Alice";
        Assert.assertEquals(testResults, testObj.sayHi(params));
    }
    
    @Test
    public void sayHiXTest(){
        String testResults = "Hello X!";
        String params = "X";
        Assert.assertEquals(testResults, testObj.sayHi(params));
    }
    
    @Test
    public void sayHiFalseTest(){
        String testResults = "X!";
        String params = "X";
        Assert.assertNotSame(testResults, testObj.sayHi(params));
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
