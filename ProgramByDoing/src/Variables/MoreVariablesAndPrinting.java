/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

/**
 *
 * @author Rene Gomez
 */
public class MoreVariablesAndPrinting {
    
    public static void main( String[] args ) {
        
        String name, eyes, teeth, hair;
        int age, height, weight;
        
        double conversionCm, heightCm, conversionKg, weightKg;
        
        name = "Zed A. Shaw";
        age = 35;     // not a lie
        height = 74;// inches
        conversionCm = .3937007;
        heightCm = 74 / conversionCm;
        weight = 180; // lbs
        conversionKg = 2.20462;
        weightKg = 180 / conversionKg;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println( "Let's talk about " + name + "." );
        System.out.println( "He's " + height + " inches (or " + heightCm + " cm)" + " tall." );
        System.out.println( "He's " + weight + " pounds (or " + weightKg + " kg)" + " heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
        System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + age + ", " + height + ", and " + weight
            + " I get " + (age + height + weight) + "." );
    }
    
}
