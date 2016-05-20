/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tipcalculator.ops;

import com.swcguild.tipcalculator.dao.TipCalculatorDAO;
import com.swcguild.tipcalculator.dto.UsualTipCalcs;
import com.swcguild.tipcalculator.ui.ConsoleIO;
import java.text.DecimalFormat;

/**
 *
 * @author Rene Gomez
 */
//Title: Tip Calculator
//Difficulty: 1
//
//Create a program which asks the user to enter in a dollar value and the tip percentage. Then print out the subtotal along with the total plus tip (grand total).
//
//This is a very simple program where you collect the value from the user, have the user enter in a tip value, add the tip to the total and print out the result. If the value the user enters is $10.00 and the tip is 15% then the total is $10.15.
//
//Output:
//Amount: $10.00
//Tip:     $1.50
//Total:  $11.50
public class TipCalculatorControllerImpl implements TipCalculatorController {

    ConsoleIO console;
    TipCalculatorDAO dao;

    public TipCalculatorControllerImpl(TipCalculatorDAO dao, ConsoleIO console) {
        this.dao = dao;
        this.console = console;

    }

    public void run() {
        dao.loadData();
        int happinessLevel = 0;
        double billAmount = 0;
        int again = 0;
        
        DecimalFormat df = new DecimalFormat("#.00");

        do {
            happinessLevel = 0;
            console.print("\n****Always tip the usual, except when you don't****");
            happinessLevel += console.readInt("\nOn a scale from 0 - 1, was your meal "
                    + "served in a timely manner?", 0, 1);
            happinessLevel += console.readInt("\nOn a scale from 0 - 1, was your meal "
                    + "served at the appropriate temperature?", 0, 1);
            happinessLevel += console.readInt("\nOn a scale from 0 - 1, did you enjoy "
                    + "the taste?", 0, 1);
            happinessLevel += console.readInt("\nOn a scale from 0 - 1, did your server "
                    + "contribute to a positive experience?", 0, 1);
            billAmount = console.readDouble("\nHow much was the bill?");
            
            UsualTipCalcs tipCentral = dao.calcTip(happinessLevel);
            
            console.print("\nYour bill is: " + billAmount
                + "\nTip percentage to decimal form: " + tipCentral.getUsualTip()
                + "\nTip amount $" + df.format(tipCentral.getUsualTip() * billAmount)
                + "\nWhat you want your server to know based on your tip: "
                + "\nI'm " + tipCentral.getHappinessInWords()
                + "\nHere's what you owe: $" + df.format(billAmount + (billAmount * tipCentral.getUsualTip())));

            again = console.readInt("Would you like to re-calculate because the tip "
                    + "seems too low, enter 1? If not enter 0.", 0, 1);
        } while (again == 1);

    }

}
