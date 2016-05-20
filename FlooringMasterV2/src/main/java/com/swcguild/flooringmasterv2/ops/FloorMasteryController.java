/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmasterv2.ops;

import java.io.IOException;

/**
 *
 * @author Rene and Carrie
 */
public interface FloorMasteryController {
    
    public void run();
    public void printMenu();
    public void displayOrders();
    public void addOrder();
    public void editOrder();
    public void removeOrder();
    public void saveCurrentWork() throws IOException;
  
    
    
    
}
