/**
 * Royce Aquino
 * File by Royce Aquino, please give credit if used
 * Version 1.0.0
 * All java related homework will be used for this application
 * and created in this application
 *
 * DISCLAIMER:
 * For any problems please email me at hidevroyce(a)gmail(.)com
 * 
 * THIS IS THE MAIN JAVA FILE THAT CONTAINS MAIN.
 *
 */
package cs108assigns;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Other "Main" function code for other assignments have been moved
 * to an extended class not present here. It's in another Java file
 * called AssignExtend.java 
 * This file is also for AssignExtend.java 
 * @author Royce
 */
public class CS108Assigns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Assignment_Five();
        
    } 
    
    /**
     * This method is just for assignment five code
     */
    public static void Assignment_Five()
    {
        System.out.println("Starting assignment five code! \n");
        ArrayList<Mecha> myMechas = new ArrayList<>();
        Mecha a = new Mecha();
        for(int x = 0; x < 5; x++)
        {
            myMechas.add(new Mecha());
        }
        
        displayAll(myMechas);
        
    }
    
    /**
     * This method takes an ArrayList of Mecha objects and prints there info.
     * @param x An ArrayList of Mecha objects
     */
    public static void displayAll(ArrayList<Mecha> x)
    {
        System.out.printf("There are: %d "+ Mecha.class.getSimpleName()+ " in the ArrayList. \n \n", x.size());
        int b = x.size();
        
        for (int a = 0 ; a < b ; a++)
        {
            x.get(a).toString();
            
        }
        // x.get(2).toString();
        System.out.println("\n --- End of display all from/for arraylist ---");
    }
      
}
