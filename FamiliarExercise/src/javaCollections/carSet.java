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
public class carSet {
    
    public static void carHashSet() {
    //Creating a new Hashset
    HashSet<String> carHash = new HashSet<String>();
    carHash.add("Lamborghini Veneno Roadster");
    carHash.add("Lykan Hypersport");
    carHash.add("Bugatti Veyron");
    carHash.add("Aston Martin One");
    carHash.add("Farrari LaFerrari");
    carHash.add("Lamborghini Aventador");
    carHash.add("McLaren F1");
    
    System.out.println("Original List");
    //Displays the HashSet using Iteration
    Iterator<String> i = carHash.iterator();
    while (i.hasNext())
        System.out.println(i.next());
    System.out.println();
    
    //Checking to see if there is a contained element
    System.out.println("Does this list have the Lamborghini Aventador: " 
                       + carHash.contains("Lamborghini Aventador"));
    System.out.println();
    
    //Removes an element of the HashSet
    carHash.remove("Bugatti Veyron");
    carHash.remove("Lykan Hypersport");
   
    System.out.println("Modified List");
    //Iterates again showing removed items
    Iterator<String> e = carHash.iterator();
    while (e.hasNext())
        System.out.println(e.next());
    
}
    
    
}
