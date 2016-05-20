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
public class Olympian {
    
    private Event event;
    private String country = "PERU";
    
    public Olympian(Event event){
        this.event = event;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String competeInEvent(){
        System.out.println("Now competing for " + country + ":");
        return event.compete();
        
    }
    
}
