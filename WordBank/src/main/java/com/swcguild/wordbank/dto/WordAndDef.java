/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.wordbank.dto;

/**
 *
 * @author Rene Gomez
 */
public class WordAndDef {
    private String word;
    private String definition;
    
    public WordAndDef(String word, String def){
        this.word = word;
        this.definition = def;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }
    
    
    
}
