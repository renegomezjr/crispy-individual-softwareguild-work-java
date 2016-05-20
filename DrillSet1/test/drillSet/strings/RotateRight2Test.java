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
//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2. 
//
//RotateRight2("Hello") -> "loHel"
//RotateRight2("java") -> "vaja"
//RotateRight2("Hi") -> "Hi"
public class RotateRight2Test {
    RotateRight2 testObj = new RotateRight2();
    
    public RotateRight2Test() {
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
    public void rotateRigh2Test(){
        Assert.assertEquals("loHel", testObj.rotateRight2("Hello"));
    }
    
    @Test
    public void rotateRightJava2(){
        Assert.assertEquals("vaja", testObj.rotateRight2("java"));

    }
    
    @Test
    public void rotateRightHi2(){
        Assert.assertEquals("Hi", testObj.rotateRight2("Hi"));

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
