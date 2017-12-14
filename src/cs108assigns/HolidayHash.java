/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs108assigns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javatuples

/**
 *
 * @author Xaiyeon
 */
public class HolidayHash {

    private final Map<Integer,ArrayList<Food>> FoodHashTable = new HashMap<Integer,ArrayList<Food>>();
    //private ArrayList<Food> bucketList = new ArrayList<Food>();
    //Multimap<String, String> mm = HashMultimap.create();
    
public void insert(Food food){
    ArrayList<Food> foodlist = new ArrayList<Food>();
    int bucketindexList = 0;
    bucketindexList = hash(food);
    FoodHashTable.put(bucketindexList, foodlist);
}
    
public void search(Food food){
    int bucketindexList = 0;
    bucketindexList = hash(food);
    // Look for key index
    if(FoodHashTable.containsKey(bucketindexList)){
        System.out.println(food.getName() + " with " + food.getCalories() + 
                " was found " + "in index: " + FoodHashTable.get(bucketindexList));
    } else{
        System.out.println("No food with that key was found.");
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
    int bucketList = 0;
    bucketList = hash(food);

}

/**
 * Used for getting a key value to use as an ID Key for HashTable
 * @param food The food
 * @return returns an integer for our key value for HashTable
 */
public Integer hash(Food food){
    int key_value;
    return key_value = food.getCalories() % 10;
}

public void display(){


}


}


