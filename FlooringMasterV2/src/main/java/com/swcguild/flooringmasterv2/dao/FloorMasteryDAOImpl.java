/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmasterv2.dao;

import com.swcguild.flooringmasterv2.dto.Order;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Rene and Carrie
 */
public class FloorMasteryDAOImpl implements FloorMasteryDAO {

    HashMap<String, ArrayList<Order>> flooringData = new HashMap<>();
    HashMap<String, ArrayList<Double>> flooringOptions = new HashMap<>();
    HashMap<String, Double> flooringTaxRates = new HashMap<>();

    private static final String FLOORING_PRODUCTS = "FlooringProducts.txt";
    private static final String TAX_DOC = "Taxes.txt";
    private static final String CONFIG_DOC = "Config.txt";
    private static final String DELIMITER = ",";
    private static final File folder = new File("FlooringMasterV2/Orders");

    DecimalFormat df = new DecimalFormat("#.00");
    Random r = new Random();

    public ArrayList<Order> displayOrders(String date) {

        return flooringData.get(date);
    }

    public String toString(Order order) {//allows us to print the dog and reduces lines of code
        String orderProperties = (order.getDate() + " || Order# " + order.getOrderNum() + " || Total:"
                + df.format(order.getTotal()) + " || " + order.getCustName() + " || " + order.getProductType()
                + " || Area:" + order.getArea() + " || MTRL $" + order.getMaterialCost() + " || LBR $" + order.getLaborCost()
                + " || " + order.getState() + " || " + order.getTaxRate()
                + " || Tax $" + df.format(order.getTax()));
        return orderProperties;

    }

    public void addOrder(String date, String custName, String state, Double length, Double width, String productType) {

        Order newOrder = new Order(custName, state, productType); //instantiae a new order

        newOrder.setDate(date);

        Double area = length * width;
        newOrder.setArea(area);

//        newOrder.setOrderNum(1);//code used to run edit order tests
        newOrder.setOrderNum((r.nextInt(999999) + 1));

        Double rate = flooringTaxRates.get(state);
        newOrder.setTaxRate(rate);

        ArrayList<Double> typeCosts = flooringOptions.get(productType);
        Double materialCost = typeCosts.get(0) * area;
        newOrder.setMaterialCost(materialCost);
        Double laborCost = (typeCosts.get(1) * area);
        newOrder.setLaborCost(laborCost);

        Double tax = (rate / 100) * (laborCost + materialCost);
        newOrder.setTax(tax);
        newOrder.setTotal(tax + laborCost + materialCost); //sets properties

        if (flooringData.containsKey(date)) { //check if already a key of that date
            ArrayList<Order> listToAdd = flooringData.get(date);
            listToAdd.add(listToAdd.size() - 1, newOrder);
            flooringData.put(date, listToAdd);
        } else {
            ArrayList<Order> addOrder = new ArrayList<>(); //go in flooringData

            addOrder.add(newOrder);
            flooringData.put(date, addOrder);
        }
    }

    public Order editOrder(String date, int orderNum) { //if date is key in hashmap pull order info
        ArrayList<Order> orders = flooringData.get(date);
        Order orderToEdit = null;
        for (Order o : orders) {
            if (o.getOrderNum() == orderNum) {
                int index = orders.indexOf(o);
                orderToEdit = orders.get(index);
                return orderToEdit;
            }

        }
        return orderToEdit;
    }

    public Order removeOrder(String date, int orderNum) { //removes order from arraylist but leaves date in hashmap
        ArrayList<Order> orders = flooringData.get(date);
        Order orderToRemove = null;
        for (Order o : orders) {
            if (o.getOrderNum() == orderNum) {
                int index = orders.indexOf(o);
                orderToRemove = orders.remove(index);
                return orderToRemove;
            }
        }
        return orderToRemove;
    }

    public void writeFile() throws IOException { //writes to file and if new date adds file to the Order directory
        Set<String> keys = flooringData.keySet();
        for (String k : keys) {
            String fileName = "Orders_" + k + ".txt";
            PrintWriter writer = new PrintWriter(new FileWriter(new File("./Orders", fileName)));
            ArrayList<Order> currentOrders = flooringData.get(k);
            for (Order o : currentOrders) {
                writer.println(o.getDate() + DELIMITER + o.getOrderNum() + DELIMITER
                        + o.getState() + DELIMITER + o.getTaxRate() + DELIMITER + o.getProductType()
                        + DELIMITER + o.getArea() + DELIMITER + o.getMaterialCost() + DELIMITER
                        + o.getLaborCost() + DELIMITER + o.getTax() + DELIMITER + o.getTotal()
                        + DELIMITER + o.getCustName());
            }
            writer.flush();
            writer.close();
        }
    }

    public void loadFlooringOptionsFromFile() throws FileNotFoundException {//pulls info for flooring type from a file

        Scanner sc = new Scanner(new BufferedReader(new FileReader(FLOORING_PRODUCTS)));

        while (sc.hasNextLine()) {
            String recordLine = sc.nextLine();
            String[] recordProperties = recordLine.split(DELIMITER);
            if (recordProperties.length < 3) {
                continue;
            }
            String productType = recordProperties[0];
            Double costPerSqFt = Double.parseDouble(recordProperties[1]);
            Double laborCostPerSqFt = Double.parseDouble(recordProperties[2]);

            ArrayList<Double> flooringCost = new ArrayList<>();
            flooringCost.add(costPerSqFt);
            flooringCost.add(laborCostPerSqFt);

            flooringOptions.put(productType, flooringCost);
        }

    }

    public void loadTaxInfoFromFile() throws FileNotFoundException {//pulls tax info for four different states from file

        Scanner sc = new Scanner(new BufferedReader(new FileReader(TAX_DOC)));

        while (sc.hasNextLine()) {
            String recordLine = sc.nextLine();
            String[] recordProperties = recordLine.split(DELIMITER);
            if (recordProperties.length < 2) {
                continue;
            }
            String stateName = recordProperties[0];
            Double taxRate = Double.parseDouble(recordProperties[1]);

            flooringTaxRates.put(stateName, taxRate);
        }

    }

    public void loadFile() throws FileNotFoundException {//loads files from our directory of Orders
        File folder = new File("./Orders");
        for (File f : folder.listFiles()) {
            if (f.isHidden()) {
                continue;
            }
            Scanner sc = new Scanner(new BufferedReader(new FileReader(f)));

            while (sc.hasNextLine()) {
                String recordLine = sc.nextLine();
                String[] recordProperties = recordLine.split(DELIMITER);
                if (recordProperties.length < 11) {
                    continue;
                }
                String date = recordProperties[0];
                int orderNum = Integer.parseInt(recordProperties[1]);
                String state = recordProperties[2];
                Double taxRate = Double.parseDouble(recordProperties[3]);
                String productType = recordProperties[4];
                Double area = Double.parseDouble(recordProperties[5]);
                Double materialCost = Double.parseDouble(recordProperties[6]);
                Double laborCost = Double.parseDouble(recordProperties[7]);
                Double tax = Double.parseDouble(recordProperties[8]);
                Double total = Double.parseDouble(recordProperties[9]);
                String custName = recordProperties[10];

                Order newOrder = new Order(custName, state, productType);
                newOrder.setOrderNum(orderNum);
                newOrder.setTaxRate(taxRate);
                newOrder.setArea(area);
                newOrder.setMaterialCost(materialCost);
                newOrder.setLaborCost(laborCost);
                newOrder.setTax(tax);
                newOrder.setTotal(total);
                newOrder.setDate(date);

                if (flooringData.containsKey(date)) {
                    ArrayList<Order> listToAdd = flooringData.get(date);
                    listToAdd.add(listToAdd.size() - 1, newOrder);
                    flooringData.put(date, listToAdd);
                } else {
                    ArrayList<Order> addOrder = new ArrayList<>(); //go in flooringData

                    addOrder.add(newOrder);
                    flooringData.put(date, addOrder);
                }
            }
        }
    }

    public boolean loadConfig() throws FileNotFoundException {//file if Production typed in loads production mode
        Scanner sc = new Scanner(new BufferedReader(new FileReader(CONFIG_DOC)));
        String config = "";
        boolean production = false;
        while (sc.hasNextLine()) {
            String recordLine = sc.nextLine();

            if (recordLine.isEmpty()) {
                continue;
            }

            config = recordLine;
            if (config.equalsIgnoreCase("production")) {
                production = true;
            } else {
                production = false;
            }

        }
        return production;
    }

}
