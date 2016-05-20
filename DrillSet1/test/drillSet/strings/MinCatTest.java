/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class MinCatTest {
    MinCat testObj = new MinCat();
    
    public MinCatTest() {
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
    public void minCatTest1() {
        Assert.assertEquals("loHi", testObj.MinCat("Hello", "Hi")); 
    }
    @Test
    public void minCatTest2() {
        Assert.assertEquals("ellojava", testObj.MinCat("Hello", "java")); 
    }
    @Test
    public void minCatTest3() {
        Assert.assertEquals("javaello", testObj.MinCat("java", "Hello")); 
    }
    @Test
    public void minCatTest4SameSize() {
        Assert.assertEquals("javalHello", testObj.MinCat("javal", "Hello")); 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
