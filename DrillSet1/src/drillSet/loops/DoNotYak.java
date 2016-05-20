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
public class DoNotYak {

    public String DoNotYak(String str) {
        String newWord = "";
        
        if (str.contains("yak")) {
            newWord += str.replace("yak", "");
            return newWord;
        } else {
            return str;
        }

    }
}
