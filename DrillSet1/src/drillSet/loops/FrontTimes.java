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
public class FrontTimes {
    
    public String frontTimes(String str, int n) {
        String word = "";
        
        String sub = str.substring(0, 3);
        for(int i = 0; i < n; i++){
            word += sub;
        }
        
        return word;
    }
}
