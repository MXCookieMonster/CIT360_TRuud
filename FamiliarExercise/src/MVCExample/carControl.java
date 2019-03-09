/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExample;

import java.util.*;
/**
 *
 * @author Tyden R
 */
public class carControl {
    
    //The creation of a new hashmap that holds the elements that the view calls
       private HashMap<String, String> car = new HashMap<String,String>();

       
	    public carControl() {
	        car.put("Lamborghini Veneno Roadster","0 to 60MPH in 2.9 Seconds");
	        car.put("Lykan Hypersport","0 to 60MPH in 2.8 Seconds");
	        car.put("Ferrari La Ferrari", "0 to 60MPH in 2.4 Seconds");
	    }

	   public void addCar(String name, String desc)
	   {
	       car.put(name,desc);
	   }

	   public String carDesc (String name)
	   {
	       String description = car.get(name);
	       return description;
	   }

	   public HashMap getMap()
	   {
	       return car;
	   }
	  
    
}
