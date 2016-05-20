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
public class SwapLast {

    public String SwapLast(String str) {
        if(str.isEmpty() || (str.length() == 1)){
            return str;
        }else if(str.length() < 3){
            String temp = str.substring(0, 1);
            String temp2 = str.substring(1, 2);
            return temp2 + temp;
        }else {
            String temp = str.substring(str.length()-2, str.length()-1);
            String tempBack = str.substring(str.length()-1, str.length());
            String newWord = str.substring(0, str.length()-2);
            return newWord + tempBack + temp; 
        }
    }
    
}
