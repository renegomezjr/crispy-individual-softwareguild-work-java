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
public class RollDice {

    public int RollDice(int die1, int die2, boolean noDoubles) {
        if(die1 == die2 && noDoubles){
            return die1 + die2 +1;
        }else{
            return die1 + die2;
        }
    }
}
