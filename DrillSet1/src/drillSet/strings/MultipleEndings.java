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
public class MultipleEndings {
    public String multipleEndings(String str) {
        String newWord = str.substring(str.length()-2, str.length());
        
        return newWord + newWord + newWord;
    }
}
