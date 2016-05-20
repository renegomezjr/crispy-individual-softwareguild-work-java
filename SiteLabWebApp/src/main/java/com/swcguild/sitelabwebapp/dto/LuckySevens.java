/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.dto;

import java.util.Random;

/**
 *
 * @author Rene Gomez & Winona Wixson
 */
public class LuckySevens {

    private int bankRoll, rollCount, rollCountAtMax, maxBankroll;
    private String initialBank;

    public LuckySevens(String initialBank) {
        this.initialBank = initialBank;
        this.bankRoll = Integer.parseInt(initialBank);
        getStats();
        
    }

    public String getInitialBank() {
        return initialBank;
    }

    public String getRollCount() {
        
        return "" + rollCount;
    }

    public String getRollCountAtMax() {
        return "" + rollCountAtMax;
    }

    public String getMaxBankroll() {
        return "" + maxBankroll;
    }

    private void getStats() {
        Random r = new Random();
        while (bankRoll >= 1) {

            int d1, d2, diceTotal;

            d1 = r.nextInt(6) + 1;
            d2 = r.nextInt(6) + 1;
            rollCount++;
            diceTotal = d1 + d2;

            if (diceTotal == 7) {

                bankRoll = bankRoll + 4;

            } else {

                bankRoll = bankRoll - 1;
            }
            if (bankRoll > maxBankroll) {
                maxBankroll = bankRoll;
                rollCountAtMax = rollCount;
            }
        }
    }

}
