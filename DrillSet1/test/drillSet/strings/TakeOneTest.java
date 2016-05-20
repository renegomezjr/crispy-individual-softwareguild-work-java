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

/**
 *
 * @author Rene Gomez
 */
//Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty. 
//
//TakeOne("Hello", true) -> "H"
//TakeOne("Hello", false) -> "o"
//TakeOne("oh", true) -> "o"

public class TakeOneTest {
    TakeOne testObj = new TakeOne();
    
    public TakeOneTest() {
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
    public void takeOneFrontTest(){
        
        Assert.assertEquals("H", testObj.takeOne("Hello", true));
    }
    
    @Test
    public void takeOneBackTest(){
        
        Assert.assertEquals("o", testObj.takeOne("Hello", false));
    }
    
    @Test
    public void takeOneFront2Test(){
        
        Assert.assertEquals("o", testObj.takeOne("oh", true));
    }
    
    @Test
    public void takeOneFrontNumerTest(){
        
        Assert.assertEquals("1", testObj.takeOne("1oh", true));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
