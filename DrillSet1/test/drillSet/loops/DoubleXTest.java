/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

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
//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x". 
//
//DoubleX("axxbb") -> true
//DoubleX("axaxxax") -> false
//DoubleX("xxxxx") -> true
public class DoubleXTest {

    DoubleX testObj = new DoubleX();

    public DoubleXTest() {
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

    @Test
    public void doubleTest() {
        Assert.assertTrue(testObj.doubleX("axxbb"));
    }

    @Test
    public void doubleFalseTest() {
        Assert.assertFalse(testObj.doubleX("axaxax"));
    }

    @Test
    public void doubleTrueXXXXXTest() {
        Assert.assertTrue(testObj.doubleX("xxxxxx"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
