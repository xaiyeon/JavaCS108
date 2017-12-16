/**
 * Assignment 8 File 
 * Royce Aquino
 * CS108
 * 
 * Dealing with HashTables/Maps
 * 
 */
package cs108assigns;

/**
 *
 * @author Royce
 */
public class Food {
    
    
    private String name;
    private int calories;

    // Default constructor
    public Food(){}
    
    // Custom constructor
    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    // toString to display on a single line
    @Override
    public String toString() {
        return "Food{ " + "name= " + name + ", calories= " + calories + " }";
    }
    
    
    
    
}
