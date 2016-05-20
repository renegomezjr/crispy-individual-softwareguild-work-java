/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tipcalculator.dao;

import com.swcguild.tipcalculator.dto.UsualTipCalcs;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Rene Gomez
 */
public class TipCalculatorDAOTest {
    
    TipCalculatorDAO testDAO;
    
    public TipCalculatorDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.testDAO = ctx.getBean("dao", TipCalculatorDAO.class);
        testDAO.loadData();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testTipCalcMethodNotNull(){
        Assert.assertNotNull(testDAO.calcTip(1));
    }
    
    @Test
    public void testTipCalcMethodCorrectString(){
        UsualTipCalcs calcObj = testDAO.calcTip(1);
        Assert.assertEquals("A Bit Happy", calcObj.getHappinessInWords());
    }
    
    @Test
    public void testTipCalcMethodCorrectDouble(){
        UsualTipCalcs calcObj = testDAO.calcTip(1);
        Double ten = .10;
        Assert.assertEquals(ten, calcObj.getUsualTip());
        
    }
}
