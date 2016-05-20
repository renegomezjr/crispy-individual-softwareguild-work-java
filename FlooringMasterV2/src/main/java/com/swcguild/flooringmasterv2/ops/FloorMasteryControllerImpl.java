/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmasterv2.ops;

import com.swcguild.flooringmasterv2.dao.FloorMasteryDAO;
import com.swcguild.flooringmasterv2.dao.FloorMasteryDAOImpl;
import com.swcguild.flooringmasterv2.dto.Order;
import com.swcguild.flooringmasterv2.io.ConsoleIO;
import com.swcguild.flooringmasterv2.io.ConsoleIOImpl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Rene and Carrie
 */
public class FloorMasteryControllerImpl implements FloorMasteryController {

    ConsoleIO console;
    FloorMasteryDAO dao;
    private boolean production = false;
    
    public FloorMasteryControllerImpl(FloorMasteryDAOImpl dao, ConsoleIOImpl console){
        this.console = console;
        this.dao = dao;
    }
    
    public FloorMasteryControllerImpl(){
    }

    public void run() {
        boolean keepRunning = true;
        try {
            //loads all files into program
            dao.loadFlooringOptionsFromFile();
            dao.loadTaxInfoFromFile();
            dao.loadFile();
            production = dao.loadConfig();

        } catch (FileNotFoundException ex) {
            console.print("The file could not be found. ");
            //throws error
        }

        while (keepRunning) {
            printMenu();
            int userInput = console.readInt("What would you like to do today, enter 1-6", 1, 6);

            switch (userInput) {

                case 1:
                    displayOrders();
                    break;
                case 2:
                    addOrder();
                    break;

                case 3:
                    editOrder();
                    break;

                case 4:
                    removeOrder();
                    break;

                case 5: {//does not save to file if in test mode
                    if (production) {
                        try {
                            saveCurrentWork();
                            console.print("Your work has been saved!");

                        } catch (IOException ex) {
                            console.print("There was an error saving your work!");
                        }
                    } else {
                        console.print("This feature isn't available in a test environment!");
                    }
                }
                break;

                default: {
                    if (production) {//will not save to files if in test mode
                        try {
                            saveCurrentWork();
                            console.print("You quit the program and everything is saved!");
                        } catch (IOException ex) {
                            console.print("There was a problem writing to the file.");
                        }
                    }
                    keepRunning = false;
                    break;

                }

            }
        }

    }

    public void printMenu() { //number 5 disabled if in test mode
        console.print("\nFlooring Master");
        console.print("1. Display Orders");
        console.print("2. Add an Order");
        console.print("3. Edit an Order");
        console.print("4. Remove an Order");
        console.print("5. Save current work");
        console.print("6. Quit");

    }

    public void displayOrders() {//uses our toString method to print out order if in HashMap ArrayList
      
        String date = console.readString("What is the date for the order?");
        ArrayList<Order> ordersToDisplay = dao.displayOrders(date);
        if (ordersToDisplay == null) {
            console.print("There are no orders matching that date.");
        } else {
            console.print("Here are your orders for that date.");
            for (Order orders : ordersToDisplay) {

                console.print(dao.toString(orders));
            }
        }
    }

    public void addOrder() {//must have date, shows orders from that date, then askes for order number
        //tries to compensate for even the worst user
        String date = console.readString("First, what is today's date MMDDYYYY: ");

        while (!date.matches("\\d{2}\\d{2}\\d{4}")) {
            date = console.readString("Please enter a date in the format MMDDYYYY: ");
        }

        String custName = console.readString("Second, let's get the customer's name: ");

        String state = console.readString("What state does the customer live in (OH, PA, MI or IN): ");
        while (!(state.equals("OH") || state.equals("PA") || state.equals("MI") || state.equals("IN"))) {
            state = console.readString("What state does the customer live in (OH, PA, MI or IN): ");
        }

        Double length = console.readDouble("What is the length of the room in feet: ", 1, 1000);
        Double width = console.readDouble("What is the width of the room in feet: ", 1, 1000);

        String productType = console.readString("What type of flooring would the customer like: (carpet, laminate, tile, wood) ").toLowerCase();
        while (!(productType.equals("carpet") || productType.equals("laminate") || productType.equals("tile") || productType.equals("wood"))) {
            productType = console.readString("What type of flooring would the customer like: (carpet, laminate, tile, wood) ").toLowerCase();
        }
        console.print("Here is your order info: \n");
        console.print(" Date: " + date + "\n");
        console.print(" Name: " + custName + "\n");
        console.print(" State: " + state + "\n");
        console.print(" Length: " + length + "\n");
        console.print(" Width: " + width + "\n");
        console.print(" Product type: " + productType);

        int userInput = console.readInt("Would you like to keep this order, enter 1 for yes and 2 for no");
        if (userInput == 1) {
            dao.addOrder(date, custName, state, length, width, productType);
        } else {
            console.print("You order has not been saved! Please choose another option:");

        }

    }

    public void editOrder() {//allows user to change order info without recalculating anything
        // tries to not let them enter data that is not in our format                                                 
        String date = console.readString("What is the date of the order to edit?");
        ArrayList<Order> ordersToDisplay = dao.displayOrders(date);
        if (ordersToDisplay == null) {
            console.print("There are no orders on that date.");
        } else {
            console.print("Here are your orders for that date.");
            for (Order orders : ordersToDisplay) {

                console.print(dao.toString(orders));

            }
            int orderNum = console.readInt("What is the order number of the order you'd like to update information for?");

            Order orderToUpdate = dao.editOrder(date, orderNum);

            if (orderToUpdate == null) {
                console.print("This order is not in our records.");
            } else {
                boolean orderUpdated = false;
                String updatedCustName = console.readString("Please enter new customer name or press enter to leave it as is.");
                if (!updatedCustName.isEmpty()) {
                    orderToUpdate.setCustName(updatedCustName);
                    orderUpdated = true;
                }

                Double updatedArea = console.readDouble("Please enter the area to update or press 0 to leave it as is.", 0, 10000);
                if (updatedArea != 0) {
                    orderToUpdate.setArea(updatedArea);
                    orderUpdated = true;
                }

                Double updatedLaborCost = console.readDouble("Please enter the new labor cost or press 0 to leave it as is.", 0, 100000);
                if (updatedLaborCost != 0) {
                    orderToUpdate.setLaborCost(updatedLaborCost);
                    orderUpdated = true;
                }
                
                Double updatedMaterialCost = console.readDouble("Please enter new material cost or press 0 to leave it as is.", 0, 100000);
                if (updatedMaterialCost != 0) {
                    orderToUpdate.setMaterialCost(updatedMaterialCost);
                    orderUpdated = true;
                }
                String updatedProductType = console.readString("Please enter new product type or press enter to leave it as is.").toLowerCase();

                if (!updatedProductType.isEmpty()) {
                    while (!(updatedProductType.equals("carpet") || updatedProductType.equals("laminate") || updatedProductType.equals("tile") || updatedProductType.equals("wood"))) {
                        updatedProductType = console.readString("What type of flooring would the customer like: (carpet, laminate, tile, wood) ").toLowerCase();
                        orderToUpdate.setProductType(updatedProductType);
                        orderUpdated = true;
                    }

                }

                Double updatedTotal = console.readDouble("Please enter new total cost or press 0 to leave it as is.", 0, 1000000);
                if (updatedTotal != 0) {
                    orderToUpdate.setTotal(updatedTotal);
                    orderUpdated = true;
                }

                if (orderUpdated) {
                    console.print("The order has been updated.");
                } else {
                    console.print("None of the order information has changed.");
                }
            }
        }
    }

    public void removeOrder() {//removes the order from the array list but leaves the date in our hashmap
        String date = console.readString("What is the date for the order?");
        ArrayList<Order> ordersToDisplay = dao.displayOrders(date);
        if (ordersToDisplay == null) {
            console.print("There are no orders to remove on that date.");
        } else {
            console.print("Here are your orders for that date.");
            for (Order orders : ordersToDisplay) {
                console.print(dao.toString(orders));

            }
            int orderNum = console.readInt("What is the order number to remove?");

            Order orderRemoved = dao.removeOrder(date, orderNum);
            if (orderRemoved != null) {
                console.print(orderRemoved.getCustName() + "'s order for " + orderRemoved.getDate() + " was removed.");

            } else {
                console.print("That order does not exist.");
            }
        }
    }

    public void saveCurrentWork() throws IOException {//only works in Production mode
        dao.writeFile();

    }

}
