/**
 * File by Royce Aquino
 * finished homework assignments will be pasted here as an extension
 * to the main java file.
 * 
 * This class isn't needed for packaging. This file is for testing (mostly).
 * 
 */
package cs108assigns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Main function extensions from pass assignments.
 * @author Royce A.
 */
public class AssignExtend extends CS108Assigns{
    
    
    // Assignment #6
    // These will be wrapped around another class for AssignExtend later
    // The below ArrayList are specific for use for Assignment #6
    public ArrayList<Character> CharacterList = new ArrayList<Character>();
    public ArrayList<Integer> intList = new ArrayList<Integer>();
    public ArrayList<String> stringList = new ArrayList<String>();
    
    // Used just for assignment #6
    public String[] randomStrings = {"apple", "are", "boo", "boat", "car", "desk", "go", "java", "python", "ruby", "swift", "yorick"};
    
     /**
     * Assignment one is for the lottery
     * thing.
     * This function uses SuperLottoPlus.java file that I made.
     */
    public void Assignment_One(){

        // Variables for first assignment
        String lotteryTicket;
        int userInputTicketNumber = 0;
        int i = 1;
        
        // class object creation
        SuperLottoPlus hw1 = new SuperLottoPlus();
        // creating scanner
        Scanner userScanner = new Scanner(System.in);
        
        // start of the actual program 
        System.out.println("Welcome to Royce's Lucky Fun Time Lotto!");
        System.out.println("How many Super Lotto tickets do you want? Please enter a positive integer.");
        while(!userScanner.hasNextInt()) 
        {
            System.out.print("ERROR: You must enter a positive integer! Type and enter now: ");
            userScanner.next();
        }
        userInputTicketNumber = userScanner.nextInt();
        
        // condition for user if negative number.
        if (userInputTicketNumber <= 0)
        {
            System.out.println("Since you entered a non-positive integer, we default to 1 ticket.");
            userInputTicketNumber = 1;
        }
        
        // the actual distribution of the super lotto tickets based on user input
        while(i <= userInputTicketNumber)
        {
            // calling the function in the class
            lotteryTicket = hw1.generateNumbers();    
            System.out.println(lotteryTicket);
            i += 1;
            lotteryTicket = "";               
        } 
    
    }
    
    /**
     * Function for our Character class. We are basically unit testing
     * our creation of Character objects. Assignment two.
     */
    public void Assignment_Two()
    {
        System.out.println("~~~~ Homework 2 ~~~~");
        System.out.println();
        System.out.println("UPDATE: Default character creation");
        System.out.println();
        Character Test1 = new Character();
        Character Test2 = new Character();        
        Test1.displayCharacterInfo();
        System.out.println();
        Test2.displayCharacterInfo();
        System.out.println();
        System.out.println("UPDATE: Changing Character with ID: " + Test1.getID() + " which is " + Test1.getFirstName() + " " + Test1.getLastName());
        System.out.println();
        Test1.setAge(19);
        Test1.setHealthPoints((double)999);
        Test1.setGender("Female");
        Test1.setFirstName("Kizuna");
        Test1.setLastName("AI");
        Test1.setAlive(false);
        Test1.displayCharacterInfo();
        System.out.println();
        System.out.println("UPDATE: Custom character creation");
        System.out.println();
        Character Test3 = new Character(1, "Thomas", "Smith", "Male", 23, (double)250, true);
        Test3.displayCharacterInfo();
        System.out.println();
    }    
    
    
     /**
     * Assignment 3.
     * For assignment three on extending the first homework of the lottery
     * to saving into a text file.
     */
    public void Assignment_Three()
    {
        // variables used
        String lotteryTicket;
        int userInputTicketNumber = 0;
        int checkInputNumber = 0;
        int i = 1;
        
        // class object creation
        SuperLottoPlus hw3 = new SuperLottoPlus();
        // creating scanner
        Scanner userScanner = new Scanner(System.in);
                
       // start of the actual program 
        System.out.println("Welcome to Royce's Lucky Fun Time Lotto (text creator edition)!");
        System.out.println("How many Super Lotto tickets do you want? Please enter a positive integer.");
        
        // adding a try catch for negative numbers.
        try
        {
            while(!userScanner.hasNextInt()) 
            {
                System.out.print("ERROR: You must enter a positive integer! Type and enter now: ");
                userScanner.next();
            }
            userInputTicketNumber = userScanner.nextInt();
            // condition for user if negative number.
            
            try
            {
                checkInputNumber = hw3.isNegative(userInputTicketNumber);
                            // a try catch if something happens to file
                try
                {
                    // the actual distribution of the super lotto tickets based on user input
                    while(i <= checkInputNumber)
                    {
                        // calling the function in the class
                        String test = hw3.generateNumbers(); 
                        SuperLottoPlus.printTicket(test);
                        i += 1;               
                    } 

                    System.out.println("Your lottery numbers have been written to the file lottery.txt");

                }  
                catch (Exception e)
                {
                    System.out.println("ERROR: Something unexpected happen: we were unable to process your lottery text file.");
                    e.printStackTrace();
                }
            }
            catch(negativeNumberException nne)
            {
                System.out.println(nne.getMessage());
                System.out.println("The program has terminated.");
            }
                                       
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());                       
        }
                    
    }
    
    /**
     * This method is four Assignment Four for testing our subclass
     * of Character class called Mecha.
     */
    public void Assignment_Four()
    {
        System.out.println("Time for some sub class action!");
        System.out.println("Time to create some Mechas that inherit from Character class. \n");
        Mecha m1 = new Mecha();
        
        System.out.println("A new mecha!");
        m1.toString();
        System.out.println("");
        m1.setGender("Apache Helicopter");
        m1.setHealthPoints((double)999);
        m1.setBuildYear(2020);
        m1.setCpuType("Atmel");
        m1.setmModel("WEP-MK2");
        System.out.println("~~~~The modified mecha!");
        m1.toString();

        System.out.println("\n");
        
        System.out.println("A custom made Mecha:");
        Mecha m2 = new Mecha(101, "Houki", "Shinonono", "Female", 19, 800, true, "IS", 2012, "EXO");        
        m2.displayCharacterInfo();
        
        System.out.println("\n");
        
        System.out.println("Checking if the Mechas are the same:");
        m1.equals(m2);
        
        System.out.println("\n");
        System.out.println("Made a new Mecha!");
        Mecha m3 = new Mecha(102, "Ichika", "Striker", "Male", 21, 1111, true, "IS", 2012, "EXO");
        m3.toString();
        
        System.out.println("\n");
        
        System.out.println("Checking if the Mechas are the same:");
        m2.equals(m3);
        
        System.out.println();
        System.out.println("~~~End of Mecha class unit-testing!~~~");
            
    }

    /**
     * This method is just for assignment five code
     */
    public void Assignment_Five()
    {
        System.out.println("Starting assignment five code! \n");
        ArrayList<Mecha> myMechas = new ArrayList<>();
        Mecha a = new Mecha();
        for(int x = 0; x < 5; x++)
        {
            myMechas.add(new Mecha());
        }
        
        displayAll_a5(myMechas);
        
    }
    
    /**
     * This was used for assignment five
     * This method takes an ArrayList of Mecha objects and prints there info.
     * @param x An ArrayList of Mecha objects
     */
    public void displayAll_a5(ArrayList<Mecha> x)
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

// Assignemtn six

/**
     * For this assignment we create generic method for handling different
     * types of data. I modified my classes such as Character and Mecha to fit
     * assignment. We also add an interface class called Printable.
     */
    public void Assignment_Six(){
        
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
   public <genVar extends Comparable<genVar>> genVar maxHighest(genVar x, genVar y, genVar z) {
      
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
    
    

   // Below is Assignment 7
   
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
    public void Assignment_Seven(){
 
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
   public void merge_sign7(ArrayList<Turkey> turkeys, int i, int j, int k) {
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

   public void mergeSort_sign7(ArrayList<Turkey> turkeys, int i, int k) {
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
   public void selectionSort(ArrayList<Turkey> turkeys, int numbersSize) {
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
   public int binarySearch(ArrayList<Turkey> turkeys, int numbersSize, int key) {
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
    public Turkey eatTurkey(Turkey t) {
        
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
