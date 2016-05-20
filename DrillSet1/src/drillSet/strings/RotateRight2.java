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
public class RotateRight2 {
    public String rotateRight2(String str) {
        String newWord;
        
        if(str.length() <= 2){
            newWord = str.substring(0, 2);
        } else{
            newWord = str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
        }
        
        return newWord;
    }
}
