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
public class NoTriplesTest {
    NoTriples testObj = new NoTriples();
    
    public NoTriplesTest() {
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
    public void testNoTriples1() {
        int[] arr = {1, 1, 2, 2, 1};
        Assert.assertTrue(testObj.NoTriples(arr)); 
    }
    @Test
    public void testNoTriples2() {
        int[] arr = {1, 1, 2, 2, 2, 1};
        Assert.assertFalse(testObj.NoTriples(arr)); 
    }
    @Test
    public void testNoTriples3() {
        int[] arr = {1, 1, 1, 2, 2, 2, 1};
        Assert.assertFalse(testObj.NoTriples(arr)); 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
