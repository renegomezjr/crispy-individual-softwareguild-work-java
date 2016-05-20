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
public class FrontBack {
//    Given a string, return a new string where the first and last chars have been exchanged. 

    public String FrontBack(String str) {
        char[] arr = str.toCharArray();
        String begin = str.substring(0, 1);
        String end = str.substring(str.length()-1, str.length());
        String newWord = "";
        for (int i = 0; i < arr.length; i++) {
            
            if (i == 0) {
                newWord += end;
            } else if (i == (arr.length - 1)) {
                newWord += begin;
            }else{
                newWord += arr[i];
            }
        }
        return newWord;
    }
}
