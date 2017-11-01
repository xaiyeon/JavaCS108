/*
 * Royce Aquino
 * File by Royce Aquino v1.1.0
 * class Character
 *
 * Oct 4, 2017:
 * - Added subclass to the Character class called
 *   Mecha, which is in file Mecha.java
 * 
 *
 */
package cs108assigns;
import java.util.Random;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
<<<<<<< HEAD
import java.util.concurrent.ThreadLocalRandom;
=======
>>>>>>> origin/HEAD

/**
 * 
 * This is my Character class for creating characters like people, 
 * but fictional.
 * Fictional characters will be used for other things.
 * @author Royce
 * 
 */
public class Character implements Printable{
    
    /**
     * These are private data types very specific to the character
     * object.
     */
    long id;
    String firstName;
    String lastName;
    String gender;
    int age;
    Double healthPoints;
    boolean alive;
    
    /**
     * Public data-types not really used for this class object but
     * added for better object creation
     */ 
    public static double characterCounter;
    public static double timestamp = System.currentTimeMillis()/ 10000000;
    private String[] gendernames = {"Unknown", "Male", "Female"};
    final int minAge = 12;
    final int maxAge = 130;
    
    /**
     * Default constructor for our Character object class if the user does
     * not pass any specific parameters.
     */
    public Character()
    {
        // update characterCounter for naming sake.
        characterCounter = Math.random();
        String temp = Double.toString(characterCounter + timestamp);
        String nId = temp.substring(temp.length() - 3);
        this.id = Long.parseLong(nId);
        this.firstName = "NPC" + nId;
        this.lastName = "A.I.";
        this.gender = gendernames[ThreadLocalRandom.current().nextInt(0, gendernames.length)];
        this.age = ThreadLocalRandom.current().nextInt(minAge, maxAge);
        this.healthPoints =  Double.parseDouble(String.valueOf(ThreadLocalRandom.current().nextInt(50, 200)));
        this.alive = true;
    }
    
    /**
     * This is the character constructor that takes all parameters from the
     * user in given order of the method.
     * @param id A unique ID for each object
     * @param fName The first name
     * @param lName The last name
     * @param ogender The gender of the 
     * @param oage Th age of their existence
     * @param hp The amount of health points they have
     * @param life If the thing is alive or dead 
     */
    public Character(long id, String fName, String lName, String ogender ,int oage, Double hp, boolean life)
    {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.gender = ogender;
        this.age = oage;
        this.healthPoints = hp;
        this.alive = life;
        
    }
    
    /**
     * Call to set the ID of character object.
     * @param idx Setting the unique ID
     */
    public void setID(long idx)
    {
        this.id = idx;
    }
    
    /**
     * Call to set the first name of character object.
     * @param fName Setting the first name
     */
    public void setFirstName(String fName)
    {
        this.firstName = fName;
    }
    
    /**
     * Call to set the last name of character object.
     * @param lName Setting the last name
     */
    public void setLastName(String lName)
    {
        this.lastName = lName;
    }
    
    /**
     * Call to set this gender of object of character object.
     * @param gender Setting the gender
     */
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    /**
     * Call to set this age of object of character object.
     * @param age Setting the age
     */
    public void setAge(int age)
    {
        this.age = age;
    }
    
    /**
     * Call to set the health points of character object.
     * @param hp Setting the health points
     */
    public void setHealthPoints(Double hp)
    {
        this.healthPoints = hp;
    }
    
    /**
     * Call to set if alive of the character object.
     * @param alive Setting if it is alive or not
     */
    public void setAlive(boolean alive)
    {
        this.alive = alive;
    }
    
    /**
     * Call to get the ID of character object.
     * @return Return the int ID
     */
    public long getID()
    {
        return this.id;
    }
    
    /**
     * Call to get the first name of character object.
     * @return Return the string first name
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    
    /**
     * Call to get the last name of character object.
     * @return Return the string last name
     */
    public String getLastName()
    {
        return this.lastName;
    }
    
    /**
     * Call to get the gender of the character object.
     * @return Return the string gender
     */
    public String getGender()
    {
        return this.gender;
    }
    
    /**
     * Call to get the age of the character object.
     * @return Return the int age
     */
    public int getAge()
    {
        return this.age;
    }
    
    /**
     * Call to get the health points of the character object.
     * @return Return the double health points
     */
    public Double getHealthPoints()
    {
        return this.healthPoints;
    }
    
    /**
     * Call to get the alive status of the character object.
     * @return Returns a boolean if alive statusS
     */
    public boolean getAlive()
    {
        return this.alive;
    }
    
    /**
     * This method is used to display the basic information of the character
     * object. We don't display the ID, because it isn't important to the 
     * user.
     */
    public void displayCharacterInfo()
    {
        System.out.println("~~~ Character Display Info: ");
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + this.getAge());
        System.out.println("Health Points: " + this.getHealthPoints());
        System.out.println("Life Status: " + this.getAlive());
        System.out.println("~~~ End of Character Display Info");  
    }

    
    /**
     * Below functions are for Assignment 6
     * @return 
     */
    
    @Override
    public String toString(){
        String sfinal = "";
        System.out.println("~~~ Character Display Info (toString): ");
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + this.getAge());
        System.out.println("Health Points: " + this.getHealthPoints());
        System.out.println("Life Status: " + this.getAlive());
        System.out.println("~~~ End of Character Display Info");        
        return sfinal;
    }
    
    @Override
    public void display(){
        System.out.println("~~~ Character Display Info (Display): ");
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + this.getAge());
        System.out.println("Health Points: " + this.getHealthPoints());
        System.out.println("Life Status: " + this.getAlive());
        System.out.println("~~~ End of Character Display Info"); 
    }
      
    @Override
    public void printToFile(){
        // Turn these on if you want a new text file for each object
        //String title = this.firstName + Long.toString(this.id);
        //String filePathString =  "Character " + title + ".txt";

        // Single
        String filePathString =  "CharactersLog.txt";
        
        // Here we will build the string.
        
<<<<<<< HEAD
        String characterS = "Character: " + "\n"
                + "ID: " + Long.toString(this.id) + "\n"
=======
        String characterS = "Character: " + this.firstName + Long.toString(this.id) + "\n"
>>>>>>> origin/HEAD
                + "Name: "  + this.firstName + " " + this.lastName + "\n" 
                + "Gender: " + this.gender + "\n"
                + "Age: " + this.age + "\n"
                + "HP: " + this.healthPoints + "\n"
                + "Life: " + this.alive + "\n"
                + "~~~~~"
                
                
                ;
        
        
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
                pWriter.append(characterS);
                pWriter.println();
                pWriter.close();
            }
        catch (IOException ioe)
            {
                ioe.printStackTrace();
            }    
    }  
    
     /**
     * Our compareTo for our character class. Could probably go down the
     * parameters and compare for each field.
<<<<<<< HEAD
     * We compare first name, then the gender, and then hp in that order.
     * The Character has to be better in HP, and then the gender and name follow.
=======
>>>>>>> origin/HEAD
     * @param o A character object
     * @return Returns an int for character object to compare to from result
     */
    @Override
    public int compareTo(Character o) {
        
        int x = this.getFirstName().compareTo(o.getFirstName());
        int y = this.getGender().compareTo(o.getGender());
<<<<<<< HEAD
        int z = this.getHealthPoints().compareTo(o.getHealthPoints());
        
        // For both x is firstname and y is gender and z is hp
        int naturalx = 0;
        int naturaly = 0;
        int naturalz = 0;
=======
        
        // For both x and y
        int naturalx = 0;
        int naturaly = 0;
>>>>>>> origin/HEAD
        
        if (x == 0)
        {
            naturalx = 0;
        }
        else if (x > 0){
            naturalx = 1;
        }
        else {
            naturalx = -1;
        }
        
        if (y == 0)
        {
            naturaly = 0;
        }
        else if (y > 0){
            naturaly = 1;
        }
        else {
            naturaly = -1;
        }
<<<<<<< HEAD

        if (z == 0)
        {
            naturalz = 0;
        }
        else if (z > 0){
            naturalz = 1;
        }
        else {
            naturalz = -1;
        }
        
        // Has the highest HP
        if (naturalz > 0)
        {
            return 1;
        }
        else if (naturalx == 0 && naturaly == 0 && naturalz == 0)
        {
            return 0;
        }
        else if (naturalx > 0 && naturaly > 0 && naturalz > 0){
=======
        
        if (naturalx == 0 && naturaly == 0)
        {
            return 0;
        }
        else if (naturalx > 0 && naturaly > 0){
>>>>>>> origin/HEAD
            return 1;
        }
        else {
            return -1;
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

