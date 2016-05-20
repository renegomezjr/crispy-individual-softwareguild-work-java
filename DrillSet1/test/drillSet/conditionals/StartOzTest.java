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
public class StartOzTest {

    public StartOzTest() {
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
    
    StartOz testObj = new StartOz();

    @Test
    public void testStartOz1() {
        Assert.assertEquals("oz", testObj.StartOz("ozymandias"));
    }

    @Test
    public void testStartOz2() {
        Assert.assertEquals("z", testObj.StartOz("bzoo"));
    }

    @Test
    public void testStartOz3() {
        Assert.assertEquals("o", testObj.StartOz("oxx"));
    }
}
