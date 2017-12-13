/**
 * Assignment 8 File 
 * Royce Aquino
 * CS108
 * 
 * 
 */
package cs108assigns;

import java.util.Calendar;

/**
 *
 * @author Royce
 */
public class HolidayDinner {
  
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        // Search date
                        Calendar calendar = Calendar.getInstance();

                        long year = calendar.get(Calendar.YEAR);
                        long month = calendar.get(Calendar.MONTH) + 1;
                        long day = calendar.get(Calendar.DAY_OF_MONTH);        
        
                        System.out.println(month + "_" + day + "_" + year);
        
    } 
    
}
