/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

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
//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo". 
//
//EveryOther("Hello") -> "Hlo"
//EveryOther("Hi") -> "H"
//EveryOther("Heeololeo") -> "Hello"
public class EveryOtherTest {

    EveryOther testObj = new EveryOther();

    @Test
    public void everyOtherTest() {
        Assert.assertEquals("Hlo", testObj.everyOther("Hello"));
    }

    @Test
    public void everyOtherHiTest() {
        Assert.assertEquals("H", testObj.everyOther("Hi"));
    }

    @Test
    public void everyOtherHeeolTest() {
        Assert.assertEquals("Hello", testObj.everyOther("Heeololeo"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
