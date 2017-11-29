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
    
    /**
     * I was going to do merge sort for optimization but dropped it.
     * I then did selection sort which is okay because the arraylist is small.
     * If the arraylist was bigger the search of n^2 is slow.
     * From Wiki:
     * Selection sort is good for lists less than 20 elements.
     * 
     * This is for assignment seven which is about the turkey stuff!
     * So sorry about the messy comments for this assignment...
     * 
     * Also I'm sorry for not showing up to class this week!
     * I go to my other class office hours and it conflicts with this classes time,
     * but I need the help for my other projects.
     * 
     */
    public static void Assignment_Seven(){
 
        // Some variables
        int find = 0;
        final int eatWhat = 32;
        
        ArrayList<Turkey> turkeys = new ArrayList<Turkey>();

        turkeys.add(new Turkey("Butterball", 20));
        turkeys.add(new Turkey("Jenni-O", 12));
        turkeys.add(new Turkey("Foster Farms", 24));
        turkeys.add(new Turkey("Honeysuckle", 17));
        turkeys.add(new Turkey("Trader Joes", 32));
        turkeys.add(new Turkey("Norbest", 10));
        turkeys.add(new Turkey("Vons O Organics", 38));
        
        System.out.println("Welcome to the Thanksgiving Turkey program thingy...");

        System.out.println("The turkeys array list before: ");
        for(int a = 0; a < turkeys.size(); a++)
        {
            System.out.println(turkeys.get(a).getType() + ": " + turkeys.get(a).getWeight());
        }
        
        // Calling our selectionsort
        selectionSort(turkeys, turkeys.size() - 1);
        /* initial call to mergesort with index */
        //mergeSort_sign7(turkeys, 0, turkeys.size() - 1);

        System.out.println();
        System.out.println("The turkeys array list after sorting: ");
        for(int a = 0; a < turkeys.size(); a++)
        {
            System.out.println(turkeys.get(a).getType() + ": " + turkeys.get(a).getWeight());
        }
        
        System.out.println();
        System.out.println("Now we be looking for a turkey...");
        find = binarySearch(turkeys, turkeys.size() - 1, eatWhat);
        
        // simple if else if we didn't find a turkey with that weight.
        if(find == -1){
            System.out.println("Sorry we can't eat a non-existant turkey yet.");
        } else {
            System.out.println("Time to eat!");
            System.out.println("Gobble Gobble, there are " + turkeys.get(find).getWeight() + " lbs. of " + turkeys.get(find).getType() + " turkey!");
            eatTurkey(turkeys.get(find));
        }
        
        System.out.println();
        System.out.println("Happy Thanksgiving!");
        
    }
 
    // TODO: Need to add 3 methods and binary search
    // sorting, binary search, and recursive method for eating turkey
    
    // Binary search for looking for turkeys
    // binary search method to search an ArrayList of Turkey objects, and return the index of the Turkey by a specified weight 
    
    // Add a recursive method called eatTurkey(Turkey t) that will recursively eat a turkey, by subtracting 1 lb of turkey for each recursive call. 
    // Use 0 lbs as the base case and print out "Done" if the turkey weight is 0.  
    // For each recursive case, print out "Gobble Gobble, there are N lbs. or turkey remaining"
    
    // Sort, any method
    // sorting method to sort th ArrayList of Turkey objects by weight (lowest to highest)
   
    // Merge sorting from Zybooks example, dropped this one...
   public static void merge_sign7(ArrayList<Turkey> turkeys, int i, int j, int k) {
      int mergedSize = k - i + 1;       // Size of merged partition
      ArrayList<Turkey> mergeTurkeys = new ArrayList<Turkey>(); // Temporary array list for merged turkeys
      int mergePos = 0;                 // Position to insert merged number
      int leftPos = 0;                  // Position of elements in left partition
      int rightPos = 0;                 // Position of elements in right partition

      leftPos = i;                      // Initialize left partition position
      rightPos = j + 1;                 // Initialize right partition position

      // Add smallest element from left or right partition to merged turkeys
      while (leftPos <= j && rightPos <= k) {
          // we sort by comparing the weight of the turkeys
         if ( turkeys.get(leftPos).getWeight() < turkeys.get(leftPos).getWeight()) {
            mergeTurkeys.add(turkeys.get(leftPos));
            ++leftPos;
         } 
         else {
            mergeTurkeys.add(turkeys.get(rightPos));
            ++rightPos;
         }
         ++mergePos;
      }

      // If left partition is not empty, add remaining elements to merged numbers
      while (leftPos <= j) {
         mergeTurkeys.add(turkeys.get(leftPos));
         ++leftPos;
         ++mergePos;
      }

      // If right partition is not empty, add remaining elements to merged numbers
      while (rightPos <= k) {
         mergeTurkeys.add(turkeys.get(rightPos));
         ++rightPos;
         ++mergePos;
      }

      // Copy merge number back to numbers
      for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
         turkeys.add(mergeTurkeys.get(mergePos));
         // basically turkey add as above
         // numbers[i + mergePos] = mergeTurkeys[mergePos];
      }
   }

   public static void mergeSort_sign7(ArrayList<Turkey> turkeys, int i, int k) {
      int j = 0;

      if (i < k) {
         j = (i + k) / 2;  // Find the midpoint in the partition

         // Recursively sort left and right partitions
         mergeSort_sign7(turkeys, i, j);
         mergeSort_sign7(turkeys, j + 1, k);

         // Merge left and right partition in sorted order
         merge_sign7(turkeys, i, j, k);
      }
   }    
    
   // Customized for turkey and arraylist
   // So we know we want to get the indexof the turkey and use that comparison
   // of the weight for switching and such.
   public static void selectionSort(ArrayList<Turkey> turkeys, int numbersSize) {
      int i = 0;
      int j = 0;
      int indexSmallest = 0;
      // temp turkey for swapping...
      Turkey temp = new Turkey("temp", 0);

      for (i = 0; i < numbersSize; ++i) {
          
         // Find index of smallest remaining element
         indexSmallest = i;
         for (j = i + 1; j < numbersSize; ++j) {

            if (turkeys.get(j).getWeight() < turkeys.get(indexSmallest).getWeight()) {
               indexSmallest = j;
            }
         }

         // Swap turkey[i] and turkey[indexSmallest]
         temp = turkeys.get(i);
         turkeys.set(i, turkeys.get(indexSmallest));         
         turkeys.set(indexSmallest, temp);
      }
   }
   
   // Binary Search from zybooks modified for turkeys.
   public static int binarySearch(ArrayList<Turkey> turkeys, int numbersSize, int key) {
      int mid = 0;
      int low = 0;
      int high = 0;
      
      high = numbersSize - 1;

      while (high >= low) {
         mid = (high + low) / 2;
         if (turkeys.get(mid).getWeight() < key) {
            low = mid + 1;
         } 
         else if (turkeys.get(mid).getWeight() > key) {
            high = mid - 1;
         } 
         else {
            System.out.println("A turkey at index: " + mid + " of " + turkeys.getClass().getSimpleName().toString() + " was found.");
            return mid;
         }
      }
      System.out.println("No turkey specified was found.");
      return -1; // not found
   }   
   
    
    // Eat turkey until gone
    // Recursive method
    public static Turkey eatTurkey(Turkey t) {
        
        // base case
        if (t.getWeight() <= 0){
            System.out.println("Turkey " + t.getType() + " is done.");
            return t;
        }
        else {
            t.setWeight(t.getWeight() - 1 );
            System.out.println("Gobble Gobble, there are " + t.getWeight() + " lbs. of " + t.getType() + " remaining\"");
            return eatTurkey(t);
        }
            
    }
     
}
