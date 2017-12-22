/**
 * Royce Aquino
 * File by Royce Aquino, please give credit if used
 * Version 1.0.0
 * All java related homework will be used for this application
 * and created in this application
 *
 * Completion Date of this program was on Dec. 19, 2017
 * This program was created as my personal mini-project of CS108
 * 
 * DISCLAIMER:
 * For any problems please email me at hidevroyce(a)gmail(.)com
 * 
 * You can also check all these files on my Github!
 * 
 * https://github.com/xaiyeon/JavaCS108
 * 
 * THIS IS THE MAIN JAVA FILE THAT CONTAINS MAIN.
 * assigment 8 has main in HolidayDinner
 * assignment 8 uses HolidayDinner, HolidayHash, and Food .java files.
 *
 */
package cs108assigns;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

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

        // Variables
        boolean start = true;
        int assignment = 0;
        Scanner user_input = new Scanner(System.in);
        
        // Create our AssignExtend and HolidayDinner
        AssignExtend assignExtend = new AssignExtend();
        HolidayDinner holidaydinner = new HolidayDinner();
        
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        long year = calendar.get(Calendar.YEAR);
        long month = calendar.get(Calendar.MONTH) + 1;
        long day = calendar.get(Calendar.DAY_OF_MONTH);        
        System.out.println(month + "-" + day + "-" + year);
        
        System.out.println("Welcome to the CS108 Assignment Program by Royce Aquino!");
        System.out.println("Below is a menu where you type a number and press enter.");
        System.out.println("Then that number corresponds to the assignment number to be executed.");
        System.out.println("Type and enter 0 (zero) to quit");
        
        while(start){
            System.out.println("Menu: Please enter a number for assignment 1 to 8! Or 0 to quit.");
            assignment = check_input();

            // Using a switch case
            switch (assignment){
                case 1: assignment = 1;
                        System.out.println("Menu: Running assignment 1...");
                        assignExtend.Assignment_One();
                        System.out.println("Menu: End of assignment 1.");
                        break;

                case 2: assignment = 2;
                        System.out.println("Menu: Running assignment 2...");
                        assignExtend.Assignment_Two();
                        System.out.println("Menu: End of assignment 2.");
                        break;

                case 3: assignment = 3;
                        System.out.println("Menu: Running assignment 3...");
                        assignExtend.Assignment_Three();
                        System.out.println("Menu: End of assignment 3.");
                        break;        
                        
                case 4: assignment = 4;
                        System.out.println("Menu: Running assignment 4...");
                        assignExtend.Assignment_Four();
                        System.out.println("Menu: End of assignment 4.");
                        break;
                
                case 5: assignment = 5;
                        System.out.println("Menu: Running assignment 5...");
                        assignExtend.Assignment_Five();
                        System.out.println("Menu: End of assignment 5.");
                        break;
                        
                case 6: assignment = 6;
                        System.out.println("Menu: Running assignment 6...");
                        assignExtend.Assignment_Six();
                        System.out.println("Menu: End of assignment 6.");
                        break;
                        
                case 7: assignment = 7;
                        System.out.println("Menu: Running assignment 7...");
                        assignExtend.Assignment_Seven();
                        System.out.println("Menu: End of assignment 7.");
                        break;
                        
                case 8: assignment = 8;
                        System.out.println("Menu: Running assignment 8...");
                        holidaydinner.assignment_8();
                        System.out.println("Menu: End of assignment 8.");
                        break;
                        
                default: System.out.println("Menu: Thank you for using CS108 Assignment Program!");
                         start = false;

            }

        }    
        
        
    } // End of main
    
    // Checking for valid integer input
    public static int check_input(){
        int return_value = 0;
        Scanner user_input = new Scanner(System.in);
        while (!user_input.hasNextInt()) user_input.next();
        return_value = user_input.nextInt();
        return return_value;
    
    }
     
}
