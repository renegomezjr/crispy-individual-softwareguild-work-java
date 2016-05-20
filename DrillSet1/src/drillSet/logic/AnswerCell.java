/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

/**
 *
 * @author Rene Gomez
 */
public class AnswerCell {

    public boolean AnswerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isMorning && isMom){
            return true;
        }else if(!isAsleep && !isMorning){
            return true;
        }else{
        return false;
        }
    }
}
