/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tipcalculator.dao;

import com.swcguild.tipcalculator.dto.UsualTipCalcs;

/**
 *
 * @author Rene Gomez
 */
public interface TipCalculatorDAO {
    
    public void loadData();
            
    public UsualTipCalcs calcTip(int happinessLevel);
}
