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
public class NotString {
//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.
    
    public String NotString(String s) {
        
        if(s.contains("not ")){
            return s;
        }else{
            return "not " + s;
        }
    }
}
