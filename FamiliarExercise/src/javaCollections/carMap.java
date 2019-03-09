/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCollections;

import java.util.*;
/**
 *
 * @author Tyden R
 */
public class carMap {
    
    public static void carModelDates() {
    
//Creates a new HashMap called carDates
    Map<String, Integer> carDate = new HashMap();
    
    //Populating the HashMap with values
    carDate.put("Lamborghini Veneno Roadster", 2015);
    carDate.put("Lykan Hypersport", 2014);
    carDate.put("Aston Martin One", 2008);
    carDate.put("Farrari LaFerrari", 2016);
    carDate.put("Lamborghini Aventador", 2016);
    carDate.put("McLaren F1", 1998);
    
    //Prints the HashMap
    System.out.println("Amazing Cars and their Release Dates: " + carDate);
    
    //Using Conditional Statements to Check Data in the Map
    System.out.println("Verifying that there are two 2016 dates");
    if(carDate.containsValue(2016)) {
        System.out.println("Two Dates Match 2016");
    }
    else 
        System.out.println("No Vaules Match 2016");
    
    //Checking a false
    System.out.println("Making sure that the date 1995 is not present");
    if(carDate.containsValue(1995)) {
        System.out.println("There's something wrong here");
    }
    else 
        System.out.println("Everything is working properly");
    
    //Replacing an Element in the HashMap
    carDate.replace("Lamborghini Veneno Roadster", 2018);
    System.out.println("Updated Map: " + carDate);
    }
    
    
 
}
