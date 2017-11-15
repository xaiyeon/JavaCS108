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
 * You can also check all these files on my Github!
 * 
 * https://github.com/xaiyeon/JavaCS108
 * 
 * THIS IS THE MAIN JAVA FILE THAT CONTAINS MAIN.
 *
 */
package cs108assigns;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.Scanner;
import java.util.ArrayList;
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
        
        Assignment_Seven();
        
    } 
    
    
    // This is for assignment seven which is about the turkey stuff!
    public static void Assignment_Seven(){
 
        
        ArrayList<Turkey> turkeys = new ArrayList<Turkey>();

        turkeys.add(new Turkey("Butterball", 20));
        turkeys.add(new Turkey("Jenni-O", 12));
        turkeys.add(new Turkey("Foster Farms", 24));
        turkeys.add(new Turkey("Honeysuckle", 17));
        turkeys.add(new Turkey("Trader Joes", 32));
        turkeys.add(new Turkey("Norbest", 10));
        turkeys.add(new Turkey("Vons O Organics", 38));
    
    
    }
    
     
}
