/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.controller;

import com.swcguild.sitelabwebapp.dto.InterestCalculator;
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
public class InterestCalculatorController {
    
    @RequestMapping(value=("/interestCalculator"), method=RequestMethod.GET)
    public String getInterestCalcPage(){
        return "interestCalculator";
    }
    
    @RequestMapping(value=("interestCalcMethod"), method=RequestMethod.POST)
    public String runningInterestCalc(Model model, HttpServletRequest req){
        double interestRate = Double.parseDouble(req.getParameter("interestRate"));
        double initialPrincipal = Double.parseDouble(req.getParameter("initialPrincipal"));
        int yearsInvesting = Integer.parseInt(req.getParameter("yearsInvesting"));
        
        InterestCalculator newInvestment = new InterestCalculator(interestRate, initialPrincipal, yearsInvesting);
        
        
        model.addAttribute("investmentResults", newInvestment.getYearsInterest());
        
        
        return "interestCalculator";
    }
    
}
