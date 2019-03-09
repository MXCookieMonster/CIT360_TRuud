/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpURLExample;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author Tyden R
 */
public class httpURLRequestEx {
     
    public static void urlRequest() throws MalformedURLException, IOException {
        
        //creates a scanner so that a user can input a URL to check
        System.out.println("Please enter a URL to see what is contained in the headings");
        Scanner keyboard = new Scanner(System.in);
        String urlAddress = keyboard.nextLine();
        URL address = new URL(urlAddress);
        HttpURLConnection urlConnect = (HttpURLConnection) address.openConnection();
        
        //Creating a loop that checks to see whats included in each header type
        for(int i = 0; i <= 6; i++) {
            System.out.println(urlConnect.getHeaderFieldKey(i));
            System.out.println("");
        }
        
        //Trys to connect you to the inputed URL, catches with connection error prompt then disconnects you.
        try {
            InputStream inStream = new BufferedInputStream(urlConnect.getInputStream());
            reader(inStream);
        } catch(Exception e) {
            System.out.println("Cannot connect you to provided URL");
        } finally {
            urlConnect.disconnect();
        }
    }
    
    private static void reader(InputStream inStream) {
        throw new UnsupportedOperationException("Unsupported References Used.");
    }
    
}
    
   
