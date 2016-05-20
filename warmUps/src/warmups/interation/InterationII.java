/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmups.interation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 *
 * @author Rene Gomez
 */
public class InterationII {
    public static void main(String[] args) {
        HashMap<String, String> nflTeams = new HashMap<>();
        
        nflTeams.put("Cleveland", "Browns");
        nflTeams.put("Pittsburg", "Steelers");
        nflTeams.put("Cincinnati", "Bengals");
        nflTeams.put("Minneapolis", "Vikings");
        nflTeams.put("Kansas City", "Chiefs");
        
        System.out.println("\nA sweet enhanced loop:");
        for(String k : nflTeams.keySet()){
            System.out.println(k +", "+ nflTeams.get(k));
        }
        
        System.out.println("\nA sweet Iterator");
        Iterator<String> dandy = nflTeams.keySet().iterator();
        while(dandy.hasNext()){
            String key = dandy.next();
            System.out.println(key + ", " +nflTeams.get(key));
        }
        
        System.out.println("\nA sweet EntrySet");
        for (Entry<String, String> e: nflTeams.entrySet()){
            System.out.println(e.getKey() +", " +e.getValue());
        }
    }
}
