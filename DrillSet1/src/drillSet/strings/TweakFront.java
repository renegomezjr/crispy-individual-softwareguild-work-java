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
public class TweakFront {

    public String TweakFront(String str) {
        if(str.length() == 0){
            return str;
        } else if(str.length() > 0 && str.substring(0, 1).equals("a")){
            if(str.length() > 1 && str.substring(1, 2).equals("b")){
                return str;
            }
            return str.substring(0,1) + str.substring(2);
            
        }else{
            return str.substring(2);
        } 
        
    }
    
}
