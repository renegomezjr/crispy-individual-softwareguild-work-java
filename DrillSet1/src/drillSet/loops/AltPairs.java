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
public class AltPairs {

    public String AltPairs(String str) {
        String newWord = "";
        
        for (int i = 0; i < str.length(); i += 4) {
            newWord += str.charAt(i);
            if(i + 1 <= str.length()-1){
            newWord += str.charAt(i+1);
            }
        }
        return newWord;
    }
    
}
