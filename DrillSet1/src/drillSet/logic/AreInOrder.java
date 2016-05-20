/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.logic;

/**
 *
 * @author Rene Gomez
 */
public class AreInOrder {

    public boolean AreInOrder(int a, int b, int c, boolean bOk) {
        if(c>b && bOk){
            return true;
        }else if(c>b && b>a){
            return true;
        }else{
        return false;
        }
    }
}
