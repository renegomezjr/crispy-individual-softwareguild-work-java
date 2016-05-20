/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.wordbank.dao;

import com.swcguild.wordbank.dto.WordAndDef;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rene Gomez
 */
public class Dictionary {
    List<WordAndDef> dictionary = new ArrayList<>();
    
    
//    public List<WordAndDef> getDictionary() {
//        return dictionary;
//    }
    public void addWord(WordAndDef wordDef){
        dictionary.add(wordDef);
        
    }
    
    public List<WordAndDef> getAllWords(){
        return dictionary;
    }
    
    
    
}
