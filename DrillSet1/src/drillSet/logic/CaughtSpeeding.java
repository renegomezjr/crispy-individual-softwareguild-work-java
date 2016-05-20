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
public class CaughtSpeeding {
//    You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. 

    public int CaughtSpeeding(int speed, boolean isBirthday) {
        int noTicket = 0;
        int smallTicket = 1;
        int bigTicket = 2;
        
        if ((speed > 80)||(speed > 85 && isBirthday)) {
            return bigTicket;
        } else if ((speed <= 80 && speed > 60 && !isBirthday)||(speed < 85 && speed > 65 && isBirthday)) {
            return smallTicket;
        } else {
            return noTicket;
        }
    }
}
