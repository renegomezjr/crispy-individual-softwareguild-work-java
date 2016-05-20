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
public class TakeOne {
    
    public String takeOne(String str, boolean fromFront) {
        String returnString;
        
        if (fromFront){
            returnString = str.substring(0, 1);
        }else {
            returnString = str.substring(str.length()-1, str.length());
        }
        
        return returnString;   
    }
    
}
