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
public class LongInMiddle {
    public String longInMiddle(String a, String b) {
        String newWord;
        if (a.length() < b.length()) {
            newWord = a + b + a;
        }else{
            newWord = b + a + b;
        }
        return newWord;
    }
}
