/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tipcalculator.dao;

import com.swcguild.tipcalculator.dto.UsualTipCalcs;
import java.util.HashMap;

/**
 *
 * @author Rene Gomez
 */
public class TipCalculatorDAOImpl implements TipCalculatorDAO {

    HashMap<Integer, UsualTipCalcs> tipData = new HashMap<>();

    public void loadData() {
        UsualTipCalcs zero = new UsualTipCalcs();
        zero.setHappinessInWords("Not Happy, but servers gotta make money too.");
        zero.setUsualTip(.08);
        UsualTipCalcs one = new UsualTipCalcs();
        one.setHappinessInWords("A Bit Happy");
        one.setUsualTip(.10);
        UsualTipCalcs two = new UsualTipCalcs();
        two.setHappinessInWords("Kinda Happy");
        two.setUsualTip(.12);
        UsualTipCalcs three = new UsualTipCalcs();
        three.setHappinessInWords("Mostly Happy");
        three.setUsualTip(.15);
        UsualTipCalcs four = new UsualTipCalcs();
        four.setHappinessInWords("The Happy");
        four.setUsualTip(.20);

        tipData.put(0, zero);
        tipData.put(1, one);
        tipData.put(2, two);
        tipData.put(3, three);
        tipData.put(4, four);
    }

    public UsualTipCalcs calcTip(int happinessLevel) {

        return tipData.get(happinessLevel);
        
    }

}
