/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class LastCharsTest {

    LastChars testObj = new LastChars();

    @Test
    public void lastCharsTest1() {
        Assert.assertEquals("ls", testObj.LastChars("last", "chars"));
    }

    @Test
    public void lastCharsTest2() {

        Assert.assertEquals("ya", testObj.LastChars("yo", "mama"));
    }

    @Test
    public void lastCharsTest3() {

        Assert.assertEquals("h@", testObj.LastChars("hi", ""));
    }
    
    @Test
    public void lastCharsTest4EmptyFirstString() {

        Assert.assertEquals("@w", testObj.LastChars("", "low"));
    }
}
