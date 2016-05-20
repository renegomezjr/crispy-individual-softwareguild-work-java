/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.controller;

import com.swcguild.sitelabwebapp.dto.FlooringCalculator;
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
public class FlooringCalculatorController {

    @RequestMapping(value = "/flooringCalc", method = RequestMethod.GET)
    public String getFlooringCalPage() {

        return "flooringCalc";
    }

    @RequestMapping(value = "flooringCalcMethod", method = RequestMethod.POST)
    public String flooringCalcMethod(Model model, HttpServletRequest req) {
        String widthString = req.getParameter("width");
        String lengthString = req.getParameter("length");
        String costString = req.getParameter("costSqFt");

        double width = Double.parseDouble(widthString);
        double length = Double.parseDouble(lengthString);
        double costSqFt = Double.parseDouble(costString);

        FlooringCalculator flooringCalc = new FlooringCalculator(width, length, costSqFt);

        model.addAttribute("calcsDone", true);
        model.addAttribute("flooringCalcs", flooringCalc);

        return "flooringCalc";
    }

}
