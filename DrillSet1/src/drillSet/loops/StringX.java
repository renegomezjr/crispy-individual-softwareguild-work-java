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
public class StringX {

    public String StringX(String str) {
        String newWord = "";
        
        for (int i = 0; i < str.length(); i++) {
            
            if((i == 0) || (i == str.length()-1)){
                newWord += str.charAt(i);
                
            }else if(str.charAt(i) != 'x'){
                newWord += str.charAt(i);
            }
        }
        
        return newWord;
    }
}
