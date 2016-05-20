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
public class BackAround {
//    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more. 

    public String BackAround(String str) {
        String letter = "";
        letter += str.charAt(str.length()-1);
        String newWord = letter + str + letter;
        return newWord;
    }
}
