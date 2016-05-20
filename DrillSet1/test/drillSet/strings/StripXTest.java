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
public class StripXTest {
    StripX testObj = new StripX();
    
    public StripXTest() {
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
    public void testStripXTest1() {
        Assert.assertEquals("Hi", testObj.StripX("xHix"));
    }
    
    @Test
    public void testStripXTest2() {
        Assert.assertEquals("Hi", testObj.StripX("xHi"));
    }
    
    @Test
    public void testStripXTest3() {
        Assert.assertEquals("Hxi", testObj.StripX("Hxix"));
    }
    
    @Test
    public void testStripXTest4EmptyString() {
        Assert.assertEquals("", testObj.StripX(""));
    }
    
    @Test
    public void testStripXTest5NoX() {
        Assert.assertEquals("Hello", testObj.StripX("Hello"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
