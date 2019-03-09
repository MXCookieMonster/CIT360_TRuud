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
public class carTree {
    
        public static void carTreeSet(){
            
            //Creates a new TreeSet
            Set<String> carsInOrder = new TreeSet<>();
            //Populating the newly created TreeSet
            carsInOrder.add("Lamborghini Veneno Roadster");
            carsInOrder.add("Lykan Hypersport");
            carsInOrder.add("Bugatti Veyron");
            carsInOrder.add("Aston Martin One");
            carsInOrder.add("Farrari LaFerrari");
            carsInOrder.add("Lamborghini Aventador");
            carsInOrder.add("McLaren F1");
           
            //TreeSets naturally order their elements
            Iterator<String> i = carsInOrder.iterator();
            while (i.hasNext())
            System.out.println("Cars ordered Alphabetically: " + i.next());
            
            //Looking for a specific element using condition statements
            if (carsInOrder.contains("McLaren F1")) {
                System.out.println("The McLaren is present in the TreeSet");
            }
            else
                System.out.println("The McLaren F1 is not present in the TreeSet");
        }
             
            
        public static void carTreeMap() {
            //Creating a TreeMap
            Map<Integer, String> numberOfCars = new TreeMap<>();
            //Populating the TreeMap's paired values
            numberOfCars.put(12, "Lamborghini Veneno Roadster");
            numberOfCars.put(5, "Lykan Hypersport");
            numberOfCars.put(18, "Bugatti Veyron");
            numberOfCars.put(9, "Aston Martin One");
            numberOfCars.put(4, "Farrari La Ferrair");
            numberOfCars.put(7, "Lamborghini Aventador");
            numberOfCars.put(6, "McLaren F1");
            
            //Like the TreeSet, the TreeMap orders it's elements
            Set<Integer> key = numberOfCars.keySet();
            Iterator<Integer> e = key.iterator();
            while (e.hasNext()) {
                int total = e.next();
                String listCar = numberOfCars.get(total);
                System.out.println(listCar + " = " + total);
            }
        }    
        
}
