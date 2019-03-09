/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONEx;

import java.io.*;
import java.util.*;
//Imports qcJSON
import org.quickconnect.json.*;
/**
 *
 * @author Tyden R
 */
public class jsonExample {
    
    //The purpose of this JSON file is to take a JSON file that you input and changes the output.
    public static void jsnEx() throws JSONException, ParseException, IOException {

		//This section lets the user know the options and listens for a selection.
		System.out.print("r = Reads a JSON string you provide and outputs a HashMap or ArrayList " + "t = Reads a JSON string and parses it");
		System.out.print("Please select an option here: ");
                Scanner listener = new Scanner(System.in);
		String userInput = listener.nextLine();

        //This case statement corrisponds with the top selections allowing for the selection.
        switch (userInput) {
            case "r":
                jsonUtility();
                break;
            case "t":
                jsonInputStream();
                break;
            default:
                System.out.println("Please restart the program and select given options.");
                break;
        }
		listener.close();
	}
	
         //After the user selects one of the provided options system prompts for a jar.
        private static void jsonUtility() throws JSONException, ParseException, IOException {
           
        //This section allows the user to input the file path    
        try ( 
            Scanner listener2 = new Scanner(System.in)) {
            String userInput2 = "";
            System.out.print("Please input your JSON file: ");
            System.out.println("");
            userInput2 = listener2.nextLine();
            
            //The jUtil will string and parse the information into an array or hashmap
            String infoIn = JSONUtilities.parse(userInput2).getClass().getSimpleName();
            
            //This is the section that tries to convert the information into a Hashmap
            if("HashMap".equals(infoIn)){
                HashMap parsedHashmapJson = (HashMap) JSONUtilities.parse(userInput2);
                System.out.println("The provided JSON file has been made into a Hashmap, the ouput is below. ");
                System.out.println("");
                System.out.println(parsedHashmapJson);
                
                //This will allow the information to be saved later
                keepOutput(parsedHashmapJson);
            } 
            //This is the section that tries to parse the information to an Array List.
            else if ("ArrayList".equals(infoIn)){
                ArrayList ParsedArrayJson;
                ParsedArrayJson = (ArrayList) JSONUtilities.parse(userInput2);
                System.out.println("The provided JSON file has been made into an Array, the output is below. ");
                System.out.println("");
                System.out.println(ParsedArrayJson);
                
                //This will allow the information to be saved later
                keepOutput(ParsedArrayJson);
            }
        }
	}
	 
        //This is the other option that can be selected. It implements the jinsteam the will read the file
        private static void jsonInputStream() throws JSONException, ParseException, IOException {
             
            Scanner infoInput;
        //creates a new scanner that allows for a JSON file to be input
        
        try (
            Scanner listener3 = new Scanner(System.in)) {
            String userInput3 = "";
            System.out.print("Enter the file path to reach your JSON file: ");
            userInput3 = listener3.nextLine();
            InputStream inputStr = new FileInputStream(new File(userInput3));
            infoInput = new Scanner(inputStr);
            String userString = "";
            
            while (infoInput.hasNext()) {
                userString += infoInput.nextLine();
            }
            
            //JSON uses Input Stream to parse through the file and create the data types.
            String inType = JSONUtilities.parse(userString).getClass().getSimpleName();
            JSONInputStream jsonInput = new JSONInputStream(new FileInputStream(new File(userInput3)));
            
            //Creates a hashmap that holds the data contained in the JSON file.
            if( "HashMap".equals(inType)){
                HashMap parsedJSONMap = (HashMap) jsonInput.readObject();
                System.out.println("The JSON file was converted into a HashMap, and here is the data.");
                System.out.println(parsedJSONMap);
                //Allows the output to be saved later
                keepOutput(parsedJSONMap);
            }
            //Createes an ArrayList that holds the data contained in the JSON file.
            else if ("ArrayList".equals(inType)){
                ArrayList parsedJSONArray = (ArrayList) jsonInput.readObject();
                System.out.println("The JSON file was converted into an ArrayList, and here is the data.");
                System.out.println(parsedJSONArray);
                //Allows the output to be saved later
                keepOutput(parsedJSONArray);
            }
        }
		infoInput.close();
	}
        
	//Finally this method allows for the outputs of the files to be saved after they have run.
        private static void keepOutput(Serializable object) throws JSONException, IOException {
            System.out.println("Would you like to save the results y or n? ");
        
            //One last scanner looking for input
            try (Scanner listener4 = new Scanner(System.in)) {
            String userInput4 = listener4.next();
            
            //The following code implements JSON to save any serializable objects.
            if (userInput4.equals("y")) {
                System.out.print("Write the filepath you would like the information saved: ");
                String filePathName = listener4.next();
                FileOutputStream fileOut = new FileOutputStream(filePathName);
                JSONOutputStream jOut = new JSONOutputStream(fileOut);
                jOut.writeObject(object);
                System.out.println("Your object has been saved!");
            }
            } 
         }
}
