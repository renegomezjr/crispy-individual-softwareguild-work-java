/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rene Gomez
 */
//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 
//
//FirstHalf("WooHoo") -> "Woo"
//FirstHalf("HelloThere") -> "Hello"
//FirstHalf("abcdef") -> "abc"

public class FirstHalfTest {
    FirstHalf testObj = new FirstHalf();
    
    public FirstHalfTest() {
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
    public void firstHalfTest() {
        Assert.assertEquals("Woo", testObj.firstHalf("WooHoo"));
    }
    
    @Test
    public void firstHalfHelloTest() {
        Assert.assertEquals("Hello", testObj.firstHalf("HelloThere"));
    }
    
    @Test
    public void firstHalfAbcTest() {
        Assert.assertEquals("abc", testObj.firstHalf("abcdef"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
