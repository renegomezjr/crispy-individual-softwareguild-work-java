/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sitelabwebapp.controller;

import com.swcguild.sitelabwebapp.dto.LuckySevens;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Rene Gomez
 */
@Controller
public class LuckySevensController {
    //still need to saniztize for unacceptable entries
    
    @RequestMapping(value="/luckySevens", method=RequestMethod.GET)
    public String luckySevensPage(){
        return "luckySevens";
    }
    
    @RequestMapping(value="/playLuckySevens", method=RequestMethod.POST)
    public String playLuckSevensForm(Map<String, String > model, HttpServletRequest req){
        String startBet = req.getParameter("initialBank");
        LuckySevens luckySevens = new LuckySevens(startBet);
//        model.addAttribute(luckySevens);
        model.put("initialBank",luckySevens.getInitialBank());
        model.put("rollCount",luckySevens.getRollCount());
        model.put("maxBankRoll",luckySevens.getMaxBankroll());
        model.put("rollCountAtMaxBank",luckySevens.getRollCountAtMax());
        
        return "luckySevens";
    }
            
}
