/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowsmaster;

//@author Rene Gomez

import java.util.Scanner;


public class WindowsMaster {
//    Scanner sc = new Scanner(System.in);
    
//    public static double takeDoubleInput(Scanner bob){
//        String stringInput = bob.nextLine();
////        return Double.parseDouble(userInput);
//        double value = Double.parseDouble(stringInput);
//        return value;
//    }
    
    Scanner globalScanner = new Scanner(System.in);
    
     public double takeDoubleInput(){ //non-static method
        String stringInput = globalScanner.nextLine();
//        return Double.parseDouble(userInput);
        double value = Double.parseDouble(stringInput);
        return value;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double height = 0;
        double width = 0;
        double perimeter = 0;
        double area = 0;
        double totalCost = 0;
        double glassPrice = 0; //per sqft
        double trimPrice = 0; //perft
        
        Scanner sc = new Scanner(System.in);
        
        String userInput = "";
        
        System.out.println("Please input the width of your window in feet: ");
        width = takeDoubleInput(sc);
//        userInput = sc.nextLine();
//        width = Double.parseDouble(userInput);
        
        System.out.println("Please add the height of your window in feet: ");
        height = WindowsMaster.takeDoubleInput(sc);  //class name. method name
//        userInput = sc.nextLine();
//        height = Double.parseDouble(userInput);
        
        area = width * height;
        perimeter = (width + height) * 2;
        
        System.out.println("Please enter the cost of the glass: $");
        userInput = sc.nextLine();
        glassPrice = Double.parseDouble(userInput);
        
        System.out.println("Please enter the cost of the trim: $");
        userInput = sc.nextLine();
        trimPrice = Double.parseDouble(userInput);
        
        System.out.println("The height of the window is " + height);
        System.out.println("The width of the window is " + width);
        
        System.out.println("The area of the window is " + area);
        System.out.println("The perimeter of the window is " + perimeter);
        
        System.out.println("You agree to pay $" + (glassPrice * area) + " for glass.");
        System.out.println("You agree to pay $" + (trimPrice * perimeter) + " for trim.");

        
        totalCost = perimeter * trimPrice + area * glassPrice;
        
        System.out.println("The total cost is " + totalCost);
        
    }
    
    
    
    
}
