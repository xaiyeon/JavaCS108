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
import java.util.Scanner;

/**
 * Main function extensions from pass assignments.
 * @author Royce A.
 */
public class AssignExtend extends CS108Assigns{
    
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
        Test1.setHealthPoints(999);
        Test1.setGender("Female");
        Test1.setFirstName("Kizuna");
        Test1.setLastName("AI");
        Test1.setAlive(false);
        Test1.displayCharacterInfo();
        System.out.println();
        System.out.println("UPDATE: Custom character creation");
        System.out.println();
        Character Test3 = new Character(1, "Thomas", "Smith", "Male", 23, 250, true);
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
        m1.setHealthPoints(999);
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
    public static void Assignment_Five()
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
    public static void displayAll_a5(ArrayList<Mecha> x)
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
