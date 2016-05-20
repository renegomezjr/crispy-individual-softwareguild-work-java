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
public class MissingChar {
//    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (Don't check for bad index). 
//    

    public String MissingChar(String str, int n) {
        char[] arr = str.toCharArray();
        String word = "";
        for(int i = 0; i < arr.length; i++){
            if(i != n){
                word += arr[i];
            }
        }
        return word;
    }

}
