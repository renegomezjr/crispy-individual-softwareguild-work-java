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
//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2. 
//
//Rotateleft2("Hello") -> "lloHe"
//Rotateleft2("java") -> "vaja"
//Rotateleft2("Hi") -> "Hi"


public class RotateLeft2Test {
    RotateLeft2 testObj = new RotateLeft2();
    
    public RotateLeft2Test() {
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
    public void rotateLeft2(){
        Assert.assertEquals("lloHe", testObj.rotateleft2("Hello"));
    }
    
    @Test
    public void rotateLeftJava2(){
        Assert.assertEquals("vaja", testObj.rotateleft2("java"));
    }
    
    @Test
    public void rotateLeftHi2(){
        Assert.assertEquals("Hi", testObj.rotateleft2("Hi"));
    }
    
    @Test
    public void rotateLeftThree2(){
        Assert.assertEquals("iHi", testObj.rotateleft2("Hii"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
