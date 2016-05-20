/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class TweakFrontTest {
    TweakFront testObj = new TweakFront();
    
    public TweakFrontTest() {
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
    public void testTweakFront1() {
         Assert.assertEquals("llo", testObj.TweakFront("Hello"));
    }
    
    @Test
    public void testTweakFront2() {
         Assert.assertEquals("aay", testObj.TweakFront("away"));
    }
    
    @Test
    public void testTweakFront3() {
         Assert.assertEquals("abed", testObj.TweakFront("abed"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
