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
public class MakeTags {
    
    public String makeTags(String tag, String content) {
        return "<" + tag + ">" + content + "</" + tag + ">";
    }
}
