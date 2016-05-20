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
public class SubStringaMatchTest {
    SubStringMatch testObj = new SubStringMatch();
    
    public SubStringaMatchTest() {
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
    public void testSubStringMatch1() {
        Assert.assertEquals(3, testObj.SubStringMatch("xxcaazz", "xxbaaz")); 
    }
    @Test
    public void testSubStringMatch2() {
        Assert.assertEquals(2, testObj.SubStringMatch("abc", "abc")); 
    }
    @Test
    public void testSubStringMatch3() {
        Assert.assertEquals(0, testObj.SubStringMatch("abc", "axc")); 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
