/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.controller;

import com.swcguild.sitelabwebapp.dto.Factorizer;
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
public class FactorizerController {
    //sanitize for 1 and make sure it is positive integers
    
    @RequestMapping(value="/factorizer", method=RequestMethod.GET)
    public String getFactorizerPageForm(){
        return "factorizer";
    }
    
    @RequestMapping(value="factorizerMethod", method=RequestMethod.POST)
    public String processFactors(Model model, HttpServletRequest req){
        String userNumberFromSite = req.getParameter("userNumber");
        int userNumber = Integer.parseInt(userNumberFromSite);
        Factorizer factorizer = new Factorizer(userNumber);
        
        
        model.addAttribute(factorizer);
        
        return "factorizer";
    }
    
}
