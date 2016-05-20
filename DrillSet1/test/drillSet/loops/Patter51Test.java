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
public class Patter51Test {
    Pattern51 testObj = new Pattern51();
    
    public Patter51Test() {
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
    public void testPattern51() {
        int[] arr = {1, 2, 7, 1};
        Assert.assertTrue(testObj.Pattern51(arr));
    }
    
    @Test
    public void testPattern512() {
        int[] arr = {1, 2, 8, 1};
        Assert.assertFalse(testObj.Pattern51(arr));
    }
    
    @Test
    public void testPattern513() {
        int[] arr = {2, 7, 1};
        Assert.assertTrue(testObj.Pattern51(arr));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
