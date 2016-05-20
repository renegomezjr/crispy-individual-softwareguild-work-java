/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.controller;

import com.swcguild.sitelabwebapp.dto.UsualTipCalcs;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author Rene Gomez
 */

@Controller
public class TipCalculatorController {

    @RequestMapping(value="/tipCalculator", method=RequestMethod.GET)
    public String getTipCalculatorPage(){
        
        return "tipCalculator";
    }
    
    @RequestMapping(value="tipCalculatorMethod", method=RequestMethod.POST)
    public String tipCalculatorForm(Model model, HttpServletRequest req){
        int userTotal = 0;
        double billAmount = Double.parseDouble(req.getParameter("bill"));
        userTotal += Integer.parseInt(req.getParameter("timely"));
        userTotal += Integer.parseInt(req.getParameter("temperature"));
        userTotal += Integer.parseInt(req.getParameter("taste"));
        userTotal += Integer.parseInt(req.getParameter("experience"));
        
        UsualTipCalcs newTip = new UsualTipCalcs(userTotal, billAmount);
        
        model.addAttribute("calcsDone", true);
        model.addAttribute("tipCalc",newTip);
        

        return "tipCalculator";
    }

 
//    public void run() {
//        dao.loadData();
//        int happinessLevel = 0;
//        double billAmount = 0;
//        int again = 0;
//        
//        DecimalFormat df = new DecimalFormat("#.00");
//
//        do {
//            happinessLevel = 0;
//            console.print("\n****Always tip the usual, except when you don't****");
//            happinessLevel += console.readInt("\nOn a scale from 0 - 1, was your meal "
//                    + "served in a timely manner?", 0, 1);
//            happinessLevel += console.readInt("\nOn a scale from 0 - 1, was your meal "
//                    + "served at the appropriate temperature?", 0, 1);
//            happinessLevel += console.readInt("\nOn a scale from 0 - 1, did you enjoy "
//                    + "the taste?", 0, 1);
//            happinessLevel += console.readInt("\nOn a scale from 0 - 1, did your server "
//                    + "contribute to a positive experience?", 0, 1);
//            billAmount = console.readDouble("\nHow much was the bill?");
//            
//            UsualTipCalcs tipCentral = dao.calcTip(happinessLevel);
//            
//            console.print("\nYour bill is: " + billAmount
//                + "\nTip percentage to decimal form: " + tipCentral.getUsualTip()
//                + "\nTip amount $" + df.format(tipCentral.getUsualTip() * billAmount)
//                + "\nWhat you want your server to know based on your tip: "
//                + "\nI'm " + tipCentral.getHappinessInWords()
//                + "\nHere's what you owe: $" + df.format(billAmount + (billAmount * tipCentral.getUsualTip())));
//
//            again = console.readInt("Would you like to re-calculate because the tip "
//                    + "seems too low, enter 1? If not enter 0.", 0, 1);
//        } while (again == 1);
//
//    }

}
