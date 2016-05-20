/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.conditionals;

/**
 *
 * @author Rene Gomez
 */
public class EveryNth {

    public String EveryNth(String str, int n) {
        String newWord = "";
        
        for (int i = 0; i < str.length(); i += n) {
            newWord += str.charAt(i);
        }
        
        return newWord;
    }
}
