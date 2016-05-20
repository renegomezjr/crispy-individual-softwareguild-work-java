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
public class SubStringMatch {

    public int SubStringMatch(String a, String b) {
        int sameCount = 0;
        int length;
        
        if(a.length()<= b.length()){
            length = a.length();
        }else{
            length = b.length();
        }
            
        for (int i = 0; i < length - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i+1)== b.charAt(i+1)){
                sameCount++;
            }
        }
        return sameCount;
    }
}
