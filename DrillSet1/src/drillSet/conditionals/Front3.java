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
public class Front3 {
//    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front. 

    public String Front3(String str) {
        String newWord = "";
        if(str.length() < 3){
            newWord = (str + str + str); 
        } else{
            String front3 = str.substring(0, 3);
            newWord = (front3 + front3 + front3);
        }
        return newWord;
    }

}
