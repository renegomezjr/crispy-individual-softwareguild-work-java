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
//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx". 
//
//CountXX("abcxx") -> 1
//CountXX("xxx") -> 2
//CountXX("xxxx") -> 3

public class CountXXTest {
    CountXX testObj = new CountXX();
    
    public CountXXTest() {
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
    public void countXXTest() {
        Assert.assertEquals(1, testObj.countXX("abcxx"));
    }
    
    @Test
    public void countXXTest2() {
        Assert.assertEquals(2, testObj.countXX("xxx"));
    }

    @Test
    public void countXXTest3() {
        Assert.assertEquals(3, testObj.countXX("xxxx"));
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
