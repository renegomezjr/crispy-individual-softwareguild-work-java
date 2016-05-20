/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.librarydao.model;

/**
 *
 * @author Rene Gomez
 */
public class Publisher {
    
    private int publisherId;
    private String name;
    private String city;
    private String state;

    public int getPublisher_id() {
        return publisherId;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisherId = publisher_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}
