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
import static org.junit.Assert.*;

/**
 *
 * @author Rene Gomez
 */
public class SleepingInTest {

    SleepingIn testObj = new SleepingIn();

    @Test
    public void sleepingInTest1() {
        Assert.assertTrue(testObj.CanSleepIn(false, false));
    }

    @Test
    public void sleepingInTest2() {
        Assert.assertFalse(testObj.CanSleepIn(true, false));
    }

    @Test
    public void sleepingInTest3() {
        Assert.assertTrue(testObj.CanSleepIn(false, true));
    }

}
