/*
 * Assignment 8 File 
 * Royce Aquino
 * CS108
 */
package cs108assigns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Royce
 */
public class HolidayHash {

    private final Map<Integer,ArrayList<Food>> FoodHashTable = new HashMap<Integer,ArrayList<Food>>();
    //private ArrayList<Food> bucketList = new ArrayList<Food>();
    //Multimap<String, String> mm = HashMultimap.create();
    
public void insert(Food food){
    ArrayList<Food> foodlist = new ArrayList<Food>();
    int bucketindexList = 0;
    bucketindexList = hash(food);
    // if it already exists just add the food in
    if (FoodHashTable.containsKey(bucketindexList)){
        // we get the list and add it on
        FoodHashTable.get(bucketindexList).add(food);
    }
    else {
        // If it does not exist we make one
        FoodHashTable.put(bucketindexList, foodlist);
        // Then put the new food in the list
        FoodHashTable.get(bucketindexList).add(food);   
    }

}
    
public void search(Food food){
    int bucketindexList = 0;
    boolean did_not_find = false;
    boolean did_find = false;
    bucketindexList = hash(food);
    // Look for key index
        for (Entry<Integer, ArrayList<Food>> entry : FoodHashTable.entrySet()) {
        // since we know it's in int calories
            for(int x = 0; x < entry.getValue().size(); x++){
                if (entry.getValue().get(x).getName().equals(food.getName()) && entry.getValue().get(x).getCalories() == food.getCalories()){
                    //System.out.println(entry.getKey());
                    System.out.println(food.getName() + " with " + food.getCalories() + " calories " + "was found " + "in index: " + entry.getKey());
                    // if we find
                    did_find = true;
                }
                else {
                    // if didn't find
                    did_not_find = true;                
                }
            }      
        } 
        // If didn't find
        if (did_not_find && !did_find){
            // We didn't find it at all
            System.out.println("The food: " + food.toString() + " with that key does not exist.");
        }

}

public void remove(Food food){
    int bucketindexList = 0;
    bucketindexList = hash(food);
    // if it already exists check the list of the size
    if (FoodHashTable.containsKey(bucketindexList)){
        // we get the list and add it on
        int size_of_list = FoodHashTable.get(bucketindexList).size();
        // Now we just remove the list if the size is only <= 1 
        if (size_of_list <= 1){
            // Since the list has one item, remove the whole thing from map
            FoodHashTable.remove(bucketindexList);
        } else {
            // now if the bucket's list has more than 1 element, we remove
            // the last added one.
            // Now we get the name and remove that from the list
            //int which_food = FoodHashTable.get(bucketindexList).indexOf(food.getName());
            FoodHashTable.get(bucketindexList).remove(food);    
        }
    }
    else {
        System.out.println("Sorry, but that food isn't found!");
    }

}

/**
 * Used for getting a key value to use as an ID Key for HashTable
 * @param food The food
 * @return returns an integer for our key value for HashTable
 */
public Integer hash(Food food){
    int key_value;
    // instead of this, lets just use calories as the key
    // return key_value = food.getCalories() % 3;
    return food.getCalories();
}

public void display(){
    System.out.println("");
    System.out.println("This is your " + this.getClass().getName());
    // This will display our values in our hashmap
    for(Map.Entry<Integer, ArrayList<Food>> e : FoodHashTable.entrySet()){
        for(Food e1 : e.getValue()){
           System.out.println("Key: " + e.getKey() + " = " + e1.toString());
        }
}

}


}


