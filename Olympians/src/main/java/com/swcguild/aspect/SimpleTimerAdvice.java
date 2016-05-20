/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.aspect;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author Rene Gomez
 */
public class SimpleTimerAdvice {

    public Object timeMethod(ProceedingJoinPoint jp) {

        Object ret = null;

        try {

            long start = System.currentTimeMillis();
            ret = jp.proceed();
            long end = System.currentTimeMillis();
            System.out.println("YEAAAAAHHHHHHHH!");
            String nameOfMethodThatJustExecuted = jp.getSignature().getName();
            System.out.println(nameOfMethodThatJustExecuted + " took " + (end - start) + "ms");
            System.out.println("YEAAAAAHHHHHHHH!");

        } catch (Throwable ex) {
            System.out.println("You broke it");
        }

        return ret;

    }

}
