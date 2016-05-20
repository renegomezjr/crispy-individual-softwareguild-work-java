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
public class RemoveDelTest {

    public RemoveDelTest() {
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
    RemoveDel testObj = new RemoveDel();

    @Test
    public void testRemoveDel1() {
        Assert.assertEquals("abc", testObj.RemoveDel("adelbc"));
    }

    @Test
    public void testRemoveDel2() {
        Assert.assertEquals("aHello", testObj.RemoveDel("adelHello"));
    }

    @Test
    public void testRemoveDel3() {
        Assert.assertEquals("adedbc", testObj.RemoveDel("adedbc"));
    }
    
}
