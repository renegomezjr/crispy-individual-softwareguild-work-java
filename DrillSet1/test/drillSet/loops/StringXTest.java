/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class StringXTest {
    StringX testObj = new StringX();
    public StringXTest() {
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
    public void testStringX1() {
        Assert.assertEquals("xHix", testObj.StringX("xxHxix"));
    }
    
    @Test
    public void testStringX2() {
        Assert.assertEquals("abcd", testObj.StringX("abxxxcd"));
    }
    
    @Test
    public void testStringX3() {
        Assert.assertEquals("xabcdx", testObj.StringX("xabxxxcdx"));
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
