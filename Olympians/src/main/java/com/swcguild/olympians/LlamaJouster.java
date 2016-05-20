/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.olympians;

/**
 *
 * @author Rene Gomez
 */
public class LlamaJouster {
    private Event event;
    
    public LlamaJouster(){
        this.event = new LlamaJoustingEvent();
      
    }
    
    public String competeInEvent(){
        return event.compete();
    }
    
    
}
