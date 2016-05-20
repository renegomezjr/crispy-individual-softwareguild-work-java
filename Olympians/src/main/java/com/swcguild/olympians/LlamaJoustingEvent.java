/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.olympians;

import java.util.Random;

/**
 *
 * @author Rene Gomez
 */
public class LlamaJoustingEvent implements Event {
    

    @Override
    public String compete() {
        Random r = new Random();
        System.out.println("Llama jousting is make-believe");
        int num = r.nextInt(1000)+1;
        
        try {
            Thread.sleep(num);
        } catch (InterruptedException ex) {
            System.out.println("You broke it!");
        }
        return "LlamaJousting";
    }
    
    
}
