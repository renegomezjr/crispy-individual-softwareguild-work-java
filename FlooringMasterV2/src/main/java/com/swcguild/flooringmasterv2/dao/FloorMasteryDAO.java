/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmasterv2.dao;

import com.swcguild.flooringmasterv2.dto.Order;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Rene and Carrie
 */
public interface FloorMasteryDAO {

    public ArrayList<Order> displayOrders(String date);
    public void addOrder(String date, String custName, String state, Double length, Double width, String productType);
    public Order editOrder(String date, int orderNum);
    public Order removeOrder(String date, int orderNum);
    public void writeFile() throws IOException;
    public void loadFlooringOptionsFromFile()throws FileNotFoundException;
    public void loadTaxInfoFromFile() throws FileNotFoundException;
    public void loadFile() throws FileNotFoundException;
    public boolean loadConfig()throws FileNotFoundException;
    public String toString(Order order);
   
}
