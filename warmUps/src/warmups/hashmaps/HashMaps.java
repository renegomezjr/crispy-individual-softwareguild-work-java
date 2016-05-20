/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmups.hashmaps;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Rene Gomez
 */
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> nbaMagic = new HashMap<>();
        
        nbaMagic.put("Smith", 23);
        nbaMagic.put("Jones", 12);
        nbaMagic.put("Jordan", 45);
        nbaMagic.put("Pippen", 32);
        nbaMagic.put("Kerr", 15);
        
        int teamPoints = 0;
        Set<String> keys = nbaMagic.keySet();
        for(String k : keys){
            teamPoints += nbaMagic.get(k);
            System.out.println("Player: " + k + "\n" + "Point total: " + nbaMagic.get(k) + "\n");
        }
        int average = teamPoints/nbaMagic.size();
        System.out.println("Team average: " + average);
        
                
    }
    
}
