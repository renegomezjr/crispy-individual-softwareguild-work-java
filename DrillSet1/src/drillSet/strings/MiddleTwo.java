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
public class MiddleTwo {
    
    public String middleTwo(String str ) {
        String returnString = str.substring((str.length()/2)-1, str.length()/2+1);
        return returnString;
    }
    
}
