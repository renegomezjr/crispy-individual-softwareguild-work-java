/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

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
public class Between10and20Test {

    public Between10and20Test() {
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
    
    Between10and20 testObj = new Between10and20();

    @Test
    public void Between10and201() {
        Assert.assertTrue(testObj.Between10and20(12, 99));
    }
    
    @Test
    public void Between10and202() {
        Assert.assertTrue(testObj.Between10and20(21, 12));
    }
    
    @Test
    public void Between10and203() {
        Assert.assertFalse(testObj.Between10and20(8, 99));
    }
}
