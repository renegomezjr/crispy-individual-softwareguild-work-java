/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Rene Gomez
 */
public class MissingCharTest {

    MissingChar testObj = new MissingChar();

    @Test
    public void missingCharTest1() {
        Assert.assertEquals("ktten", testObj.MissingChar("kitten", 1));
    }

    @Test
    public void missingCharTest2() {
        Assert.assertEquals("itten", testObj.MissingChar("kitten", 0));
    }

    @Test
    public void missingCharTest3() {
        Assert.assertEquals("kittn", testObj.MissingChar("kitten", 4));
    }
}
