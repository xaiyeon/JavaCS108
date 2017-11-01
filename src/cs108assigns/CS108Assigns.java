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

   
    // Assignment #6
    // These will be wrapped around another class for AssignExtend later
    // The below ArrayList are specific for use for Assignment #6
    public static ArrayList<Character> CharacterList = new ArrayList<Character>();
    public static ArrayList<Integer> intList = new ArrayList<Integer>();
    public static ArrayList<String> stringList = new ArrayList<String>();
    
    // Used just for assignment #6
    public static String[] randomStrings = {"apple", "are", "boo", "boat", "car", "desk", "go", "java", "python", "ruby", "swift", "yorick"};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Assignment_Six();
        
    } 
    
    /**
     * For this assignment we create generic method for handling different
     * types of data. I modified my classes such as Character and Mecha to fit
     * assignment. We also add an interface class called Printable.
     */
    public static void Assignment_Six(){
        
        // Random initializations
        String aString = randomStrings[ThreadLocalRandom.current().nextInt(0, randomStrings.length)];
        String bString = randomStrings[ThreadLocalRandom.current().nextInt(0, randomStrings.length)];
        String cString = randomStrings[ThreadLocalRandom.current().nextInt(0, randomStrings.length)];
        
        int aInt = ThreadLocalRandom.current().nextInt(-100, 100);
        int bInt = ThreadLocalRandom.current().nextInt(-100, 100);
        int cInt = ThreadLocalRandom.current().nextInt(-100, 100);
        
        Character c1 = new Character();
        Character c2 = new Character();
        Character c3 = new Character();
    
        // Start
        
        System.out.println("Lets do max of Strings!");
        System.out.println("Our strings are: " + aString + ", " + bString + ", " + cString);
        System.out.print("The max value String is: ");
        String maxa = maxHighest(aString,bString,cString);
        System.out.println(maxa);
        
        Collections.sort(stringList);
        System.out.println("Second highest is: " + stringList.get(1));
        
        System.out.println();
        
        System.out.println("Lets do max of integers!");
        System.out.println("Our integers are: " + aInt + ", " + bInt + ", " + cInt);
        System.out.print("The max value integer is: ");
        int maxb = maxHighest(aInt,bInt,cInt);
        System.out.println(maxb);
     
        Collections.sort(intList);
        System.out.println("Second highest is: " + intList.get(1));
        
        System.out.println();
        
        System.out.println("Lets do max of characters!");
        System.out.println("Our characters are: ");
        System.out.print(c1 + "" + c2 + "" + c3);
        System.out.println();
        System.out.println("The max value or best character is: ");
        Character maxc = maxHighest(c1,c2,c3);
        System.out.println(maxc);
        
        Collections.sort(CharacterList);
        System.out.println("Second highest is: ");
        System.out.println(CharacterList.get(1));
        
        System.out.println();
        System.out.println("Created and printed a text file with best character called CharactersLog.txt!");
        maxc.printToFile();
        
        System.out.println("Thank you!");
        // End
              
    }

    // Generic method that handles different object types
    /**
     * Generic method that handles different object types
     * @param <genVar> A generic type
     * @param x a parameter of any object
     * @param y a parameter of any object
     * @param z a parameter of any object
     * @return 
     */
   public static <genVar extends Comparable<genVar>> genVar maxHighest(genVar x, genVar y, genVar z) {
      
       // arraylist for storing items from high to lowest
       ArrayList<genVar> order = new ArrayList<>();
       
       // Assume
       genVar max = x; 
       genVar temp;
       order.add(x);
      
      if(y.compareTo(max) > 0) {
         max = y;
         order.remove(0);
         order.add(y);
         order.add(x);
      }
      else {
         order.clear();
         order.add(x);
         order.add(y);
      }
      
      if(z.compareTo(max) > 0) {
         max = z;
         order.clear();
         order.add(z);
         
         // now for x and y
         temp = y;
         if(y.compareTo(temp) > 0){
            order.add(z);
            order.add(y);
         }
         else {
             order.clear();
             order.add(z);
             order.add(y);
             order.add(x);
         }
         
      }
      else {
          
         temp = y;
         if(y.compareTo(temp) > 0){
            order.add(y);
            order.add(z);
         }
         else{
             order.clear();
             order.add(y);
             order.add(z);
             order.add(x);
         }
      }
   
      // Ignore that order listarray in above logic...
      // I want to know what class it is so I can assign the correct global
      // arraylist to it.
      if(z.getClass() == Character.class)
       {
           CharacterList.clear();
           CharacterList = (ArrayList<Character>) order;
       }
      
      if(z.getClass() == Integer.class)
       {
           intList.clear();
           intList = (ArrayList<Integer>) order;
       }

      if(z.getClass() == String.class)
       {
           stringList.clear();
           stringList = (ArrayList<String>) order;
       }
      
      return max;  
   }
     
}
