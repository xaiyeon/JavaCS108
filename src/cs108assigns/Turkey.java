/**
 * Turkey class
 * Student name: Royce Aquino
 * CS 108 
 */
package cs108assigns;

/**
 * Used for assignment #7 which is about thanksgiving!
 * @author Royce
 */
public class Turkey {
    
    private String type;
    private int weight;   //weight rounded up, in lbs.

    public Turkey(String type, int weight) {
            super();
            this.type = type;
            this.weight = weight;
    }
    /**
     * @return the type
     */
    public String getType() {
            return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
            this.type = type;
    }
    /**
     * @return the weight
     */
    public int getWeight() {
            return weight;
    }
    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
            this.weight = weight;
    }
    
}
