/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertweight;

import java.util.Scanner;

/**
 *
 * @author nickroutsong
 */
public class ConvertWeight {

    private final static double KILOGRAMS_PER_POUND = 0.4533592; // Conversion Constant
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("This program converts pounds into kilograms");
        
        System.out.println("\nPlease enter name:"); // Prompt user for their name
        
        // Create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        String name = inFile.nextLine();
        
        // Prompt the user to enter weight in pounds
        System.out.println("\nEnter the weight in pounds:");
        
        double weightInPounds = inFile.nextDouble(); // Get weight from console
        
        // Convert the weight to kilograms
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        
        // Display weight in kilograms to the console
        System.out.println("\n*****************************************");
        System.out.println("\t" + name
                            + ", The weight is " + weightInKilograms
                            + " kilograms");
        System.out.println("\n*****************************************\n");
        
    }
    
}
