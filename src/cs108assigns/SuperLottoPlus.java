/*
 * Credit is given where stated.
 * Class file by Royce Aquino
 */
package cs108assigns;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Royce
 * 
 * Relevant references
 * https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
 * https://stackoverflow.com/questions/3951547/java-array-finding-duplicates
 * https://stackoverflow.com/questions/10904911/how-to-convert-an-int-array-to-string-with-tostring-method-in-java
 * https://alvinalexander.com/java/java-custom-exception-create-throw-exception
 * 
 */
public class SuperLottoPlus {
    
    /**
     * This is the main method for generating the lotto tickets
     * and returns it in a String object.
     * @return Returns a string of the lotto numbers
     */
    public String generateNumbers()
    {
        // You can change this for more lotto numbers
        // Remember array start at index 0!
        final int amountofLottoNumber = 5;
        
        // Change below variables for range of tickets
        final int lottoMin = 1;
        final int lottoMax = 47;
        final int megaMin = 1;
        final int megaMax = 27;
        
        // END OF CHANGEABLE VARIABLES
        // Do not change anything below this line
        // --------------------------------------------------------------------
        // This array is for holding the lottoNumber, no duplicates
        int[] arrayLotto = new int[amountofLottoNumber];     
        int lottoNumber = 0;
        int megaNumber = 0;
        int randomLottoNumber = 0;
        String lottoTicket = "";
        String buildTicket = "";
        String megaTicket = "";
        String finalTicket = "";
        
        // Temp variables for checking and storing
        int tempLotto = 0;
        
        // Loop variables below
        // since we start with 2 base numbers, it starts at 1, cause 0,1...
        int gettingLotto = 1;
        boolean lottoDuplicate;
        
        // Set-up variables
        
        // true by default
        lottoDuplicate = true;
        
        // add one to max to make it inclusive
        lottoNumber = ThreadLocalRandom.current().nextInt(lottoMin, lottoMax + 1);
        megaNumber = ThreadLocalRandom.current().nextInt(megaMin, megaMax + 1);
      
        // we can start storing these numbers for string concat conversion 
        // need two numbers to start comparing for duplicates
        arrayLotto[0] = lottoNumber;
        arrayLotto[1] = lottoNumber;
        
        // keeps going to get unique lotto numbers
        while(gettingLotto < amountofLottoNumber)
        { 
            lottoDuplicate = IsSameNumber(randomLottoNumber, arrayLotto, amountofLottoNumber);
            
            // if true, we generate another one...
            if(lottoDuplicate == true)
            {
                randomLottoNumber = ThreadLocalRandom.current().nextInt(lottoMin, lottoMax + 1);                
            }
            // if false, we store that number, increment the while loop
            // then we generate another number
            if(lottoDuplicate == false)
            {
                arrayLotto[gettingLotto] = randomLottoNumber;
                gettingLotto += 1;
                randomLottoNumber = ThreadLocalRandom.current().nextInt(lottoMin, lottoMax + 1);          
            }             
        }       
        // once we exit the above loop, which means we have all our numbers
        // we will build the final String to return to the user.
                                                    
        // now a convert lotto numbers to String.
        lottoTicket = Arrays.toString(arrayLotto).replaceAll("\\[|\\]||\\s", "");
        lottoTicket = lottoTicket.replaceAll(",", " ");
        
        // more string concats to the final String
        megaTicket = lottoTicket + " MEGA " + "(" + megaNumber + ")";
        finalTicket = megaTicket;
        
        return finalTicket;
        
    }
    
    /**
     * This function is used to check if the randomly generated number
     * is already present in the array.
     * @param randomGenNumber Takes a random number for lotto
     * @param currentArray Takes the array of the lotto numbers
     * @param arraySize The size of the array in integers
     * @return 
     */
    public static boolean IsSameNumber(int randomGenNumber, int[] currentArray, int arraySize)
    {
        for(int x = 0; x < arraySize; x++)
        {
            if(randomGenNumber == currentArray[x])
            {
                // if the number is the same, we return true
                // when true we generate another number
                return true;           
            }     
        }
        // we return false if no numbers in the array are equal to the
        // newly generated one
        return false;
    }
    
    /**
     * Assignment 3
     * Part of assignment three for writing to text file.
     * @param lottoNumber The string of the entire lotto numbers
     */
    public static void printTicket(String lottoNumber)
    {
        String filePathString = "lottery.txt";
        
        // Print writer for use because of new line
        PrintWriter pWriter = null;
        
        File f = new File(filePathString);
        
        // check to see if file exists, if not create it.
        if(!f.exists())
        {
            try
                {
                    f.createNewFile();
                }
            catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }         
        }
        
        // then we append the new lottery ticket to the text file.
        try
        {
            pWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(f, true), "UTF-8"));
            pWriter.append(lottoNumber);
            pWriter.println();
            pWriter.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }    
        

    }
    
    // Adding custom negative number exception checking here
    // This will also call our exception that is below
    public int isNegative(int checkNum)
    throws negativeNumberException
    {     
        {
            if (checkNum <= 0)
            {
                throw new negativeNumberException();
            }
            else
            {
                // it was not 0 or negative.
                return checkNum;
            }
        }
    }
    
}


/**
 * Our own exception for printTicket of text file.
 * Part of Assignment 3
 * @author Royce
 */
// Didn't find a use to actually use this
class printTicketException extends Exception
{
      // Parameterless Constructor
      public printTicketException() 
      {
          super("ERROR: Something went wrong with writing to the text file.");
      }

      // Constructor that accepts a custom message
      public printTicketException(String message)
      {
         super(message);
      }
 }

/**
 * Our own exception for handling negative numbers.
 * @author Royce
 */
class negativeNumberException extends Exception
{
      // Parameterless Constructor
      public negativeNumberException() 
      {
          super("Exception ERROR: Negative numbers are not valid inquiries.");
      }

      // Constructor that accepts a custom message
      public negativeNumberException(String message)
      {
         super(message);
      }
 }