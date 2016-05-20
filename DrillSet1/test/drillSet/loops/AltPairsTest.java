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
public class AltPairsTest {
    
    AltPairs testObj = new AltPairs();
    
    
    public AltPairsTest() {
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
    public void testAltPairs1() {
        Assert.assertEquals("kien", testObj.AltPairs("kitten")); 
    }
    
    @Test
    public void testAltPairs2() {
        Assert.assertEquals("Chole", testObj.AltPairs("Chocolate")); 
    }
    
    @Test
    public void testAltPairs3() {
        Assert.assertEquals("Congrr", testObj.AltPairs("CodingHorror")); 
    }


}
