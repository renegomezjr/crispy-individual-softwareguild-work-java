/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

/**
 *
 * @author Rene Gomez
 */
public class StringTimes {
    
    public String stringTimes(String str, int n) {
        String word = "";
        for(int i = 0; i < n; i++){
            word += str;
        }
        
        return word;
    }
}

