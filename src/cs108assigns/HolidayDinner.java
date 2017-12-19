/**
 * Assignment 8 File 
 * Royce Aquino
 * CS108
 * 
 * Learning Hashmap, HashTable, Map, Multi-Hashmap,
 * These are like dictionaries in other languages.
 * 
 * I used a HashMap because it made sense for me and
 * pick up. I tried to do a HashTable, but I got confused...
 * 
 * HashMap is okay because it allows null values for the key
 * and value, and is non-synchronized, which means HashMap is
 * better for our application since it's only one 1 thread.
 * 
 */
package cs108assigns;

import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Used for Assignment 8
 * @author Royce
 */
public class HolidayDinner {
  
    
    public void assignment_8(){
    
               // Some variables used for random
        int rand = 0;
        
        // Creating our new HolidayHash.
        HolidayHash holihash = new HolidayHash();
        
        // Welcome
        System.out.println("Welcome to the HolidayHash!");
        System.out.println("");
        // Now we make ten food items with random calories...
        // Could of stored into an array and used a for loop or lamdba thing.
        rand = ThreadLocalRandom.current().nextInt(1, 1000);
        Food f1 = new Food( "Mashed Potatoes" , rand);
        rand = ThreadLocalRandom.current().nextInt(1, 1000);
        Food f2 = new Food( "Turkey" , rand);
        rand = ThreadLocalRandom.current().nextInt(1, 1000);
        Food f3 = new Food( "Roast Beef" , rand);
        rand = ThreadLocalRandom.current().nextInt(1, 1000);
        Food f4 = new Food( "Chocolate Pudding" , rand);
        rand = ThreadLocalRandom.current().nextInt(1, 1000);
        Food f5 = new Food( "Fruitcake" , rand);
        rand = ThreadLocalRandom.current().nextInt(1, 1000);
        Food f6 = new Food( "Chowmein" , rand);
        rand = ThreadLocalRandom.current().nextInt(1, 1000);
        Food f7 = new Food( "Lumpia" , rand);
        rand = ThreadLocalRandom.current().nextInt(1, 1000);
        Food f8 = new Food( "Fried Rice" , rand);
        // Last three will have same calories
        Food f9 = new Food( "Water" , 50);
        Food f10 = new Food( "Juice" , 50);
        Food f11 = new Food( "Beer" , 50);
        // A food to prove my search function works.
        Food s1 = new Food("FakeFood", 42);
        
        // now we insert all of them into the hashmap.
        holihash.insert(f1);
        holihash.insert(f2);
        holihash.insert(f3);
        holihash.insert(f4);
        holihash.insert(f5);
        holihash.insert(f6);
        holihash.insert(f7);
        holihash.insert(f8);
        holihash.insert(f9);
        holihash.insert(f10);
        holihash.insert(f11);
        
        
        // Lets see what we have so far.
        holihash.display();
        
        // Now we remove one of the foods.
        // It will actuall remove a random one...
        System.out.println("");
        System.out.println("Now we are removing " + f9.getName());
        holihash.remove(f9);
                
        // Search for a food.
        System.out.println("Now we are searching for " + f10.getName());
        holihash.search(f10);
        System.out.println("Now we are searching for " + s1.getName());
        holihash.search(s1);
        
        // Lets see what we have so far.
        holihash.display();
        
        System.out.println("");
        // A date 
        System.out.print("Happy Holidays Mr. Gappy! - ");
        Calendar calendar = Calendar.getInstance();
        long year = calendar.get(Calendar.YEAR);
        long month = calendar.get(Calendar.MONTH) + 1;
        long day = calendar.get(Calendar.DAY_OF_MONTH);        
        System.out.print(month + "_" + day + "_" + year);
        
        System.out.println("");
                      

}
    
        
}
