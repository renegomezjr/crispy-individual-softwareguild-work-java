/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.loops;

/**
 *
 * @author Rene Gomez
 */
public class EveryOther {

    public String everyOther(String str) {

        String newWord = "";
        for (int i = 0; i < str.length(); i += 2) {

            newWord += str.charAt(i);

        }
        return newWord;
    }

}
