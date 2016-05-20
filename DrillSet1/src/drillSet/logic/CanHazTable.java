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
public class CanHazTable {

    public int CanHazTable(int yourStyle, int dateStyle) {
        int no = 0;
        int maybe = 1;
        int yes = 2;

        if ((yourStyle >= 8 && yourStyle > 2) || (dateStyle >= 8 && dateStyle > 2)) {
            return yes;
        } else if (yourStyle <= 2 || dateStyle <= 2) {
            return no;
        } else {
            return maybe;
        }
    }
}
