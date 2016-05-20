/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rene Gomez
 */
//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". 
//
//Abba("Hi", "Bye") -> "HiByeByeHi"
//Abba("Yo", "Alice") -> "YoAliceAliceYo"
//Abba("What", "Up") -> "WhatUpUpWhat"

public class AbbaTest {
    Abba testObj = new Abba();
    
    public AbbaTest() {
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
    public void abbaTestHi() {
        String testResult = "HiByeByeHi";
        Assert.assertEquals(testResult, testObj.abba("Hi", "Bye"));
    }
    
    @Test
    public void abbaTestYo() {
        String testResult = "WhatUpUpWhat";
        Assert.assertEquals(testResult, testObj.abba("What", "Up"));
    }
    
    @Test
    public void abbaTestWhat() {
        String testResult = "YoAliceAliceYo";
        Assert.assertEquals(testResult, testObj.abba("Yo", "Alice"));
    }
    
    @Test
    public void abbaTestFail() {
        String testResult = "HiByeByeHi";
        Assert.assertEquals(testResult, testObj.abba("Hi", "Bye"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
