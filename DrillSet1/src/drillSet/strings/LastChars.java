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
public class LastChars {
    
    public String LastChars(String str, String str2) {
     if (str.length() == 0) {
            return "@" + str2.substring(str2.length()-1, str2.length());
        }else if(str2.length() == 0) {
            return str.substring(0,1) + "@";
        } else{
            return str.substring(0, 1) + str2.substring(str2.length()-1, str2.length());
        }
    }

}
