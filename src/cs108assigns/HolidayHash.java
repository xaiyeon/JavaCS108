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
    bucketindexList = hash(food);
    // Look for key index
        for (Entry<Integer, ArrayList<Food>> entry : FoodHashTable.entrySet()) {
        ArrayList<Food> v = entry.getValue();
        if (v.contains(food.getCalories())){
            //System.out.println(entry.getKey());
            System.out.println(food.getName() + " with " + food.getCalories() + " was found " + "in index: " + entry.getKey());
            break;
        } else {
            // We didn't find it at all
            System.out.println("No food with that key was found.");
            break;
        }
    }
    
    // Not sure if this was going to work, discarded...
    //int s = FoodHashTable.get(bucketindexList);
//    for(Map.Entry entry: FoodHashTable.entrySet()){
//        if(entry.getValue().equals(value)){
//            key = (int) entry.getKey();
//            break; //breaking because its one to one map
//        }
//    }

}

public void remove(Food food){
    // Now we just remove the list if the size is only <= 1 
    int bucketindexList = 0;
    bucketindexList = hash(food);
    // if it already exists check the list of the size
    if (FoodHashTable.containsKey(bucketindexList)){
        // we get the list and add it on
        int size_of_list = FoodHashTable.get(bucketindexList).size();
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
    return key_value = food.getCalories() % 3;
}

public void display(){
    System.out.println("");
    System.out.println("This is your " + this.getClass().getName());
    // This will display our values in our hashmap
    for(Map.Entry<Integer, ArrayList<Food>> e : FoodHashTable.entrySet()){
        for(Food e1 : e.getValue()){
           System.out.println(e.getKey() + " = "+ e1.toString());
        }
}

}


}


