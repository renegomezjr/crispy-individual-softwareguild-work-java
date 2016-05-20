/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

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
public class TwoIsOneTest {
    
    public TwoIsOneTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    TwoIsOne testObj = new TwoIsOne();
    
     @Test
     public void testTwoIsOne1() {
         Assert.assertTrue(testObj.TwoIsOne(1, 2, 3));
     }
     
     @Test
     public void testTwoIsOne2() {
         Assert.assertTrue(testObj.TwoIsOne(3, 1, 2));
     }
     
     @Test
     public void testTwoIsOne3() {
         Assert.assertFalse(testObj.TwoIsOne(3, 2, 2));
     }
}
