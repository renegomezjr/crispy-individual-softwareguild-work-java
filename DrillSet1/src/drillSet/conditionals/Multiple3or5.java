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
public class Multiple3or5 {
//    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator

    public boolean Multiple3or5(int number) {
        if((number % 3 == 0) || (number % 5 == 0)){
            return true;
        } else{
            return false;
        }
    }
}
