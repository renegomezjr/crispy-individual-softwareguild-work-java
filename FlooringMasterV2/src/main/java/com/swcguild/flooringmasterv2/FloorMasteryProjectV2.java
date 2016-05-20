/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmasterv2;

import com.swcguild.flooringmasterv2.ops.FloorMasteryController;
import com.swcguild.flooringmasterv2.ops.FloorMasteryControllerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Rene and Carrie
 */
public class FloorMasteryProjectV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        FloorMasteryController controller = ctx.getBean("controller", FloorMasteryControllerImpl.class);

        controller.run();

    }
}
