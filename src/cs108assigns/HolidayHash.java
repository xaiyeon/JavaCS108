/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs108assigns;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author Xaiyeon
 */
public class HolidayHash {

    private final Hashtable FoodHashTable = new Hashtable();
    //private ArrayList<Food> bucketList = new ArrayList<Food>();
    
public void insert(Food food){
    int bucketindexList = 0;
    bucketindexList = hash(food);
    FoodHashTable.put(bucketindexList, food);
}
    
public void search(Food food){
    int bucketindexList = 0;
    bucketindexList = hash(food);
    int key;
    int value = food.getCalories();
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


