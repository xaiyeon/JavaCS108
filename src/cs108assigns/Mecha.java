/*
 * Royce Aquino 
 *
 * This class extands the Character class
 *
 * Mecha class v1.0.0
 *
 * The Mecha class is for robots and machines.
 *
 *
 */
package cs108assigns;

import java.time.Year;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Mecha class extends the Character class
 * which is for robots and machines.
 * @author Royce
 */
public class Mecha extends Character {
    
    private String cpuType;
    private int buildYear;
    private String mModel;
    // Can change these variables
    final private double hpScale = 3;
    final private int minAge = 1;
    final private int maxAge = 10;
    
    /**
     * Public data-types not really used for this class object but
     * added for better object creation. mechaCounter for object count
     * and timestamp for Unique name specifier. Others like currYear
     * are for the Year Make and CPU brands for randomize.
     */ 
    public static double mechaCounter;
    public static double timestamp = System.currentTimeMillis()/ 10000000;
    private int currYear = Year.now().getValue();
    private String[] cpubrands = {"AMD", "ARM", "Intel", "NVDIA", "TI", "MicroChip"};
    
    /**
     * Default constructor for our Mecha object class if the user does
     * not pass any specific parameters.
     */
    public Mecha()
    {
        // update mechaCounter for naming sake.
        mechaCounter = Math.random();
        String temp = Double.toString(characterCounter + timestamp);
        String nId = temp.substring(temp.length() - 3);
        this.id = Long.parseLong(nId);
        this.firstName = "MECHA" + "-" + "M" + nId;
        this.setLastName("MK1");
        this.gender = "Unknown";
        this.age = ThreadLocalRandom.current().nextInt(minAge, maxAge);
        this.healthPoints = hpScale * ThreadLocalRandom.current().nextInt(100, 500);
        this.alive = true;
        this.buildYear = currYear - this.age;
        this.cpuType = cpubrands[ThreadLocalRandom.current().nextInt(0, cpubrands.length)];
        this.mModel = "Unknown";
    }    
    
    /**
     * Mecha constructor.
     * @param id A unique ID for each object
     * @param fName The first name
     * @param lName The last name
     * @param ogender The gender of the 
     * @param oage Th age of their existence
     * @param hp The amount of health points they have
     * @param life If the thing is alive or dead
     * @param cputype What kind of processor the Mecha has
     * @param buildyear What year the Mecha was made
     * @param model The model name of Mecha
     */
    public Mecha(long id, String fName, String lName, String ogender ,int oage, double hp, boolean life, String cputype, int buildyear, String model)
    {
        this.id = id;
        this.firstName = fName + "-M" ;
        this.lastName = lName;
        this.gender = ogender;
        this.age = oage;
        this.healthPoints = hp;
        this.alive = life;
        this.cpuType = cputype;
        this.buildYear = buildyear;
        this.mModel = model;
    }
    
    
    /**
     * Getter for cpuType
     * @return a String
     */
    public String getCpuType() {
        return cpuType;
    }

    /**
     * Setter for cpuType
     * @param cpuType 
     */
    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    /**
     * Setter for buildYear
     * @param buildYear 
     */
    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    /**
     * Get for buildYear
     * @return an int
     */
    public int getBuildYear() {
        return buildYear;
    }

    /**
     * Get for mModel, which is mecha model
     * @return A string
     */
    public String getmModel() {
        return mModel;
    }

    /**
     * Set for mModel, which is mecha model
     * @param mModel gets the string
     */
    public void setmModel(String mModel) {
        this.mModel = mModel;
    }

    
    
    /**
     * Display the base Character info with this Mecha one as well.
     */
    @Override
    public void displayCharacterInfo() {
        //super.displayCharacterInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("~~~ Character Display Info: ");
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + this.getAge());
        System.out.println("Health Points: " + this.getHealthPoints());
        System.out.println("Life Status: " + this.getAlive());
        System.out.println("Year Make: " + this.getBuildYear());
        System.out.println("Main CPU: " + this.getCpuType());
        System.out.println("~~~ End of Character Display Info"); 
    }
    
    /**
     * 
     * @return Basically a display of our class but override object for
     * our Mecha.
     */
    @Override
    public String toString()
    {
        System.out.println("~~~ Character Display Info: ");
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + this.getAge());
        System.out.println("Health Points: " + this.getHealthPoints());
        System.out.println("Life Status: " + this.getAlive());
        System.out.println("Year Make: " + this.getBuildYear());
        System.out.println("Main CPU: " + this.getCpuType());
        System.out.println("~~~ End of Character Display Info"); 
        return "";
    }
    
    /**
     * This checks if two Mechas are the same or not
     * @param m A Mecha object
     * @return Returns boolean true or false
     */
    public boolean equals(Mecha m)
    {
        System.out.println("Mechas are considered same if same year and model.");
        if((this.buildYear == m.buildYear) && (this.mModel == m.mModel))
        {
            System.out.println("Mechas: " + this.firstName + " " + this.lastName + " and " + m.firstName + " " + m.lastName + " are the same Mecha.");
            return true;
        }
        else
        {
            System.out.println("Mechas: " + this.firstName + " " + this.lastName + " and " + m.firstName + " " + m.lastName + " are NOT the same Mecha.");
            return false;
        }
                
    }    
    
    
}
