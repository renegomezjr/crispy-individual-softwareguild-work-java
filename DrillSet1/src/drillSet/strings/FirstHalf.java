/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.strings;

/**
 *
 * @author Rene Gomez
 */
public class FirstHalf {
    
    public String firstHalf(String str) {
        String newWord = str.substring(0, str.length()/2);
        return newWord;
    }
    
}
