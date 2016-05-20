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
public class FrontAndBack {

    public String FrontAndBack(String str, int n) {
        String[] arr = str.split("");
        String newWord = "";
        
        for (int i = 0; i < n; i++) {
            newWord += arr[i];
        }
        
        for(int i = arr.length-n; i <arr.length; i++){
            newWord += arr[i];
        }
        
        return newWord;
    }
}
