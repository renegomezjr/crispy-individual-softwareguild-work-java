/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.olympians;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Rene Gomez
 */
public class LlamaOlympics {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Olympian plg = ctx.getBean("peruvianLlamaJouster", Olympian.class);
        System.out.println(plg.competeInEvent());
//        nlg.competeInEvent();
    }
    
}
