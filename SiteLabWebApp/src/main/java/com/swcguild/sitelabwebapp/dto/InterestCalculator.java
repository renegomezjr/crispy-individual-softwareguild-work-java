/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rene Gomez and Winona Wixson
 */
public class InterestCalculator {

    private double annualRate; //get user
    private double initialPrincipal; //get user
    private int years; //get user
    private int currentYear = 2016; //year interest was earned 
    private double principalAtBeg;
    private double earnedYearlyInterest; //do this for each year
    private double principalAtEnd = 0.0; //grand total
    private List<YearlyInterestReport> yearsInterest = new ArrayList<>();

    public InterestCalculator(double annualRate, double initialPrincipal, int years) {
        

        this.annualRate = annualRate;

        this.initialPrincipal = initialPrincipal;

        this.years = years;

        principalAtBeg = initialPrincipal;
        double currentBalance = initialPrincipal;
        
        for (int i = 0; i < years; i++) {
            YearlyInterestReport thisYear = new YearlyInterestReport();
            thisYear.setCurrentYear(currentYear);
            thisYear.setPriceAtBeg(principalAtBeg);

            //print principal at beginning here, before the years interest is calculated
//            "\nFor " + currentYear + " you're starting with $" + principalAtBeg + ".";
            //for loop, models earning interest for a year 
            for (int j = 0; j < 4; j++) {

                //calculate principalAtEnd currentBalance
                currentBalance = currentBalance * (1 + annualRate / 400);

            }

            principalAtEnd = currentBalance;
            earnedYearlyInterest = principalAtEnd - principalAtBeg;
            thisYear.setPrincipalAtEnd(principalAtEnd);
            thisYear.setEarnedYearlyInterest(earnedYearlyInterest);

            //            "You earned $" + earnedYearlyInterest + " this year.")
            //            "And you have $" + principalAtEnd + " at the end of " + currentYear + "."
            //updating values for new year
            yearsInterest.add(thisYear);
            principalAtBeg = principalAtEnd;
            currentYear++;

        }
    }

    public List<YearlyInterestReport> getYearsInterest() {
        return yearsInterest;
    }

}

//check mathX
//fix decimalsX
//everything else needed for assignment, next stepsX
//Extra challenge - change loop interations to 12 and 400 to 1200
//extr - switch for month, quart, etc. loop in each switch option.
