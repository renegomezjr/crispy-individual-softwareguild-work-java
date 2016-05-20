/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tipcalculator;

import com.swcguild.tipcalculator.ops.TipCalculatorController;
import com.swcguild.tipcalculator.ops.TipCalculatorControllerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Rene Gomez
 */
public class TipCalculatorApp {
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TipCalculatorController controller = ctx.getBean("controller", TipCalculatorControllerImpl.class);
        controller.run();
    }
    
}
