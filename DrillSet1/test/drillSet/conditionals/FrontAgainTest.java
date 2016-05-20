/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class FrontAgainTest {
    FrontAgain testObj = new FrontAgain();
    
    public FrontAgainTest() {
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
    
    @Test
    public void frontAgainTest1() {
        Assert.assertTrue(testObj.FrontAgain("edited"));
    }
    
    @Test
    public void frontAgainTest2() {
        Assert.assertFalse(testObj.FrontAgain("edit"));
    }
    
    @Test
    public void frontAgainTest3() {
        Assert.assertTrue(testObj.FrontAgain("ed"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
