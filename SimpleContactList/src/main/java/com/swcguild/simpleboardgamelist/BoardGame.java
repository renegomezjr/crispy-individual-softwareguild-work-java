/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.simpleboardgamelist;

/**
 *
 * @author Rene Gomez
 */
public class BoardGame {
    private int minPlayers;
    private int maxPlayers;
    private int avgDuration;
    private String name;
    private String publisher;

    public BoardGame(int minPlayers, int maxPlayers, int avgDuration, String name, String publisher) {
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.avgDuration = avgDuration;
        this.name = name;
        this.publisher = publisher;
    }
    
    

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getAvgDuration() {
        return avgDuration;
    }

    public void setAvgDuration(int avgDuration) {
        this.avgDuration = avgDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
}
