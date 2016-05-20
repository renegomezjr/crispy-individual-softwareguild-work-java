/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

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
public class AlarmClockTest {
    AlarmClock testObj = new AlarmClock();
    
    @Test
    public void alarmClockTest1(){
        Assert.assertEquals("7:00", testObj.AlarmClock(1, false)); 
    }
    
    @Test
    public void alarmClockTest2(){
        Assert.assertEquals("7:00", testObj.AlarmClock(5, false)); 
    }
    
    @Test
    public void alarmClockTest3(){
        Assert.assertEquals("10:00", testObj.AlarmClock(0, false)); 
    }
    
    @Test
    public void alarmClockTest4(){
        Assert.assertEquals("off", testObj.AlarmClock(0, true)); 
    }

}
