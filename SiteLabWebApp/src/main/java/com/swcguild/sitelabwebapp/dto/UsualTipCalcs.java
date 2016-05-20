package com.swcguild.sitelabwebapp.dto;

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rene Gomez
 */
public class UsualTipCalcs {
    
    private String happinessInWords;
    private double usualTip;
    private double billAmount;
    private double amountToPay;
    HashMap<Integer, String> happiness = new HashMap<>();
    HashMap<Integer, Double> amount = new HashMap<>();

    public UsualTipCalcs(int num, double billAmount) {
        happiness.put(0, "Not Happy, but servers gotta make money too.");
        amount.put(0, .08);
        
        happiness.put(1, "I'm a Bit Happy");
        amount.put(1,.10);
        
        happiness.put(2,"I'm Kinda Happy");
        amount.put(2, .12);
        
        happiness.put(3,"I'm Mostly Happy");
        amount.put(3, .15);
        
        happiness.put(4,"I'm The Happy");
        amount.put(4, .20);
        
        this.happinessInWords = happiness.get(num);
        this.usualTip = amount.get(num);
        this.billAmount = billAmount;
        this.amountToPay =  this.billAmount + (this.billAmount * this.usualTip);

    }

    public String getHappinessInWords() {
        return happinessInWords;
    }

    
    public Double getUsualTip() {
        return usualTip;
    }

    public double getAmountToPay() {
        return amountToPay;
    }
    
    public double getBillAmount(){
        return billAmount;
    }

   
}
