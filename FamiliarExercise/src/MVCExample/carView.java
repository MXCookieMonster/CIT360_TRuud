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
public class carView {
   
    //View layer is created and displays everything that the user sees and interacts with.
     public static void carViewer(){
	        carControl carcntrl = new carControl();
	        Scanner scanner = new Scanner(System.in);

                //Prints a list of options that the user can pick from
	        for (boolean i = true; i; ){
	            System.out.println("\n What would you like to do?" +
	                    "\n1 = View Cars" +
	                    "\n2 = Add Car" +
	                    "\n3 = Get Description of Car" +
	                    "\n4 = Exit\n");
	            int casenumber = scanner.nextInt();

                    //This begins the case statements that allow the user to pick list items.
	            switch (casenumber){
	                case (1):
	                    System.out.println(carcntrl.getMap());
	                    break;
	                
                        //This case allows the User to enter a new car and desciption for the car.
                        case (2):
	                	scanner.nextLine();
	                    System.out.println("\nWhat is the cars name?:");
	                    String carInput = scanner.nextLine();
	                    System.out.println("\nHow would you like to describe the car?:");
	                    String carDesc = scanner.nextLine();
	                    carcntrl.addCar(carInput, carDesc);
	                    break;
                            
                        //Third case allows the user to view a description of a car.
	                case (3):
	                	scanner.nextLine();
	                    System.out.println("Which car do you want the description for?");
	                    String chooseCar = scanner.nextLine();
	                    carcntrl.carDesc(chooseCar);
	                    break;
	                
                        //Lastly the User can exit the list.
                        default:
	                    i = false;
	                    break;
	            }
	        }
	    }
}
