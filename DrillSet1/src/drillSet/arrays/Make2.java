/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drillSet.arrays;

/**
 *
 * @author Rene Gomez
 */
public class Make2 {
//    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays. 

    public int[] make2(int[] a, int[] b) {
        int[] newArr = new int[2];
        
        for (int i = 0; i < newArr.length; i++) {
            if (a.length == 0) {
                newArr[i] = b[i];
            } else if (a.length < 2) {
                if (i == 0) {
                    newArr[i] = a[i];
                } else {
                    newArr[i] = b[0];
                }

            }else{
                newArr[i] = a[i];
            }
        }
        return newArr;
    }
}
