/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.dto;

/**
 *
 * @author Rene Gomez
 */
public class FlooringCalculator {
    private double width;
    private double length;
    private double costSqFt;
    private double flooringCost;
    private double laborCost;
    private double laborTime;
    private double areaSqFt;
    private final double PER_QUARTER_HOUR = 86 / 4;
    
    public FlooringCalculator(double width, double length, double costSqFt){
        this.width = width;
        this.length = width;
        this.costSqFt = costSqFt;
        this.areaSqFt = width * length;
        
        this.flooringCost = areaSqFt * costSqFt;
        double leftOverFt = areaSqFt % 5;
        laborTime = (areaSqFt-leftOverFt) / 5;
        
        if(leftOverFt > 0){
            laborTime = laborTime + 1;
        }
        
        laborCost = laborTime * PER_QUARTER_HOUR;
    }

  

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getCostSqFt() {
        return costSqFt;
    }

    public double getFlooringCost() {
        return flooringCost;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public double getLaborTime() {
        return laborTime;
    }

    public double getAreaSqFt() {
        return areaSqFt;
    }

  
    
}
