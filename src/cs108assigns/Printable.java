/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs108assigns;

/**
 * This is an interface based for Homework Assignment 6
 * 
 * This is implemented to our Character and Mecha class
 * 
 * @author Royce
 */
public interface Printable extends Comparable<Character> {
    
    @Override
    public String toString();
    
    public void display();
      
    public void printToFile();
    
    /**
     * Our compareTo for our character class
     * @param o A character object
     * @return Returns an int for character object to compare to from result
     */
    @Override
    public int compareTo(Character o);
    
}
