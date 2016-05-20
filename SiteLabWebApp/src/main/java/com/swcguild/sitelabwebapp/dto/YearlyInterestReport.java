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
public class YearlyInterestReport {
    private int currentYear;
    private double priceAtBeg;
    private double principalAtEnd;
    private double earnedYearlyInterest;

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public double getPriceAtBeg() {
        return priceAtBeg;
    }

    public void setPriceAtBeg(double priceAtBeg) {
        this.priceAtBeg = priceAtBeg;
    }

    public double getPrincipalAtEnd() {
        return principalAtEnd;
    }

    public void setPrincipalAtEnd(double principalAtEnd) {
        this.principalAtEnd = principalAtEnd;
    }

    public double getEarnedYearlyInterest() {
        return earnedYearlyInterest;
    }

    public void setEarnedYearlyInterest(double earnedYearlyInterest) {
        this.earnedYearlyInterest = earnedYearlyInterest;
    }
    
    
}
