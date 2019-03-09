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
 * 
 * Arrays are an incredibly useful tool when needing to store sets
 * of information. They can hold simple strings or integers
 * in an index starting at 0 and fills slots called elements
 * with the data that you want to store. 
 *
 */
public class carArrayList {
    
    public static void dreamCarArray() {
        
        //Declares a new array list being created
        ArrayList<String> car = new ArrayList<>();
        car.add("Lamborghini Veneno Roadster");
        car.add("Lykan Hypersport");
        car.add("Bugatti Veyron");
        car.add("Aston Martin One");
        car.add("Farrari LaFerrari");
        
        System.out.println("Original List");
        //Iteratetes through the list printing the cars
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }
        System.out.println(" ");
        
        //Changing, Removing, and adding elements in the list
        //Changes the first elements information to the Lamborghini Aventador
        car.set(0, "Lamborghini Aventador");
        
        //Removing an element from a list
        car.remove(3);
        
        //Adds an element to the Arraylist
        car.add("McLaren F1");
        
        System.out.println("Modified List");
        //Iteratetes again printing the changes
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }
    } 
}
